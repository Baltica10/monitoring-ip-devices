package com.monitoringip.monitoringip.controller;

import com.monitoringip.monitoringip.dto.DeviceDto;
import com.monitoringip.monitoringip.model.device.Device;
import com.monitoringip.monitoringip.service.DeviceService;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.List;

import static com.monitoringip.monitoringip.util.Patch.DEVICE;
import static org.springframework.http.ResponseEntity.ok;

@Log4j
@RestController
@RequestMapping({DEVICE})
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/")
    public ResponseEntity<List<DeviceDto>> findById() {
        List<DeviceDto> allDevicesDto;
        try {
            allDevicesDto = deviceService.findAllDto();
        } catch (EntityNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
        }
        return ok().body(allDevicesDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeviceDto> findById(@PathVariable("id") Long id) {
        Device device;
        try {
            device = deviceService.findById(id);
        } catch (EntityNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
        }
        return ok().body(DeviceDto.createDto(device));
    }
}
