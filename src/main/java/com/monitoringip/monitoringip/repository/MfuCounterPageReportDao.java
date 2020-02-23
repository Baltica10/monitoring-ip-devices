package com.monitoringip.monitoringip.repository;

import com.monitoringip.monitoringip.model.report.MfuCounterPageReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MfuCounterPageReportDao extends JpaRepository<MfuCounterPageReport, Long> {
}
