package com.monitoringip.monitoringip.model.device;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vendor;
    private String model;
    private String serialNumber;

    @OneToOne(fetch = FetchType.EAGER)
    private DeviceSettings deviceSettings;

    @OneToOne(fetch = FetchType.EAGER)
    private DeviceType deviceType;


}
