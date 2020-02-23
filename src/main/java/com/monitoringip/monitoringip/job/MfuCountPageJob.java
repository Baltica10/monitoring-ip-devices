package com.monitoringip.monitoringip.job;

import com.monitoringip.monitoringip.model.report.MfuCounterPageReport;
import com.monitoringip.monitoringip.repository.DeviceDao;
import com.monitoringip.monitoringip.repository.MfuCounterPageReportDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class MfuCountPageJob {

    final MfuCounterPageReportDao mfuCounterPageReportDao;
    final DeviceDao deviceDao;

    public MfuCountPageJob(MfuCounterPageReportDao mfuCounterPageReportDao, DeviceDao deviceDao) {
        this.mfuCounterPageReportDao = mfuCounterPageReportDao;
        this.deviceDao = deviceDao;
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
                    report.setPageCounter(7777);
                    return report;
                })
                .collect(Collectors.toList());

        mfuCounterPageReportDao.saveAll(allReports);

        log.info("MfuCountPageJob ended");
    }

}
