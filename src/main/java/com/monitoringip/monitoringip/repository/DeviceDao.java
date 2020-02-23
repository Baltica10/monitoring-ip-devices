package com.monitoringip.monitoringip.repository;

import com.monitoringip.monitoringip.model.device.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDao extends JpaRepository<Device, Long> {
}
