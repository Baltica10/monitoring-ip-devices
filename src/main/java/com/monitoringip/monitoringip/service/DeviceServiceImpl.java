package com.monitoringip.monitoringip.service;

import com.monitoringip.monitoringip.dto.DeviceDto;
import com.monitoringip.monitoringip.model.device.Device;
import com.monitoringip.monitoringip.repository.DeviceDao;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceDao deviceDao;

    public DeviceServiceImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public Device findById(Long id) {
        return deviceDao.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Устройство с таким id не найдено"));
    }

    @Override
    public List<DeviceDto> findAllDto() {
        return deviceDao.findAll().stream()
                .map(DeviceDto::createDto)
                .collect(Collectors.toList());
    }
}
