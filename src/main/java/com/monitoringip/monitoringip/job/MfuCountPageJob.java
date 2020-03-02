package com.monitoringip.monitoringip.job;

import com.monitoringip.monitoringip.model.device.Device;
import com.monitoringip.monitoringip.model.report.MfuCounterPageReport;
import com.monitoringip.monitoringip.repository.DeviceDao;
import com.monitoringip.monitoringip.repository.MfuCounterPageReportDao;
import com.monitoringip.monitoringip.service.mail.MailSender;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class MfuCountPageJob {
    public Integer pageCounter;

    private final MfuCounterPageReportDao mfuCounterPageReportDao;
    private final DeviceDao deviceDao;
    private final MailSender mailSender;

    public MfuCountPageJob(MfuCounterPageReportDao mfuCounterPageReportDao, DeviceDao deviceDao, MailSender mailSender) {
        this.mfuCounterPageReportDao = mfuCounterPageReportDao;
        this.deviceDao = deviceDao;
        this.mailSender = mailSender;
    }

    @Scheduled(cron = "${mfu.counter-page.cron}")
    public void start() {
        log.info("MfuCountPageJob started");

        LocalDateTime currentTime = LocalDateTime.now();

        List<MfuCounterPageReport> allReports = deviceDao.findAll().stream()
                .map(device -> {
                    MfuCounterPageReport report = new MfuCounterPageReport();
                    report.setDevice(device);
                    report.setReportTime(currentTime);
                    report.setPageCounter(findCounter(device));
                    return report;
                })
                .collect(Collectors.toList());

        mfuCounterPageReportDao.saveAll(allReports);

        log.info("MfuCountPageJob ended");
    }

    private Integer findCounter(Device device) {

        try {
            String urlPageCount = device.getDeviceSettings().getUrlPageCount();
            String ipDevice ="http://"+device.getDeviceSettings().getIpAdr();
            Document doc = Jsoup.connect(ipDevice+urlPageCount).get();

            Elements rows = doc.select("tr");
            rows.forEach(element -> {
                Elements tds = element.select("td");
                if (tds.get(0).text().equals(device.getDeviceSettings().getFindPatternPageCount())) {
                    pageCounter = Integer.valueOf(tds.get(1).text());
                }
            });
            return pageCounter;
        } catch (Exception e) {
            System.out.println("Не удалось прочитать значения оттиска страниц для устройства: " +
                    device.getModel() + " SN:" + device.getSerialNumber() + " причина: " + e);
            return null;
        }
    }
}
