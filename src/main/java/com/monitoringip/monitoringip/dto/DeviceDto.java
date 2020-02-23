package com.monitoringip.monitoringip.dto;

import com.monitoringip.monitoringip.model.device.Device;
import com.monitoringip.monitoringip.model.device.DeviceSettings;
import com.monitoringip.monitoringip.model.device.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Data
public class DeviceDto {

    private Long id;
    private String vendor;
    private String model;
    private String serialNumber;
    private DeviceSettings deviceSettings;
    private DeviceType deviceType;

    public static DeviceDto createDto(@NotNull Device device){
        return new DeviceDto()
                .setId(device.getId())
                .setVendor(device.getVendor())
                .setModel(device.getModel())
                .setSerialNumber(device.getSerialNumber())
                .setDeviceSettings(device.getDeviceSettings())
                .setDeviceType(device.getDeviceType());
    }

}
