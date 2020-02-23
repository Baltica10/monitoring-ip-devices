package com.monitoringip.monitoringip.model.device;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class DeviceSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ipAdr;

    private String mask;

    private String gateway;

    private String dns;

    private String urlPageCount;
}
