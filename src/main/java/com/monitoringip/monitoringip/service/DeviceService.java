package com.monitoringip.monitoringip.service;

import com.monitoringip.monitoringip.dto.DeviceDto;
import com.monitoringip.monitoringip.model.device.Device;

import java.util.List;

public interface DeviceService {

    Device findById (Long id);

    List<DeviceDto> findAllDto();

}
