package com.monitoringip.monitoringip.model.report;

import com.monitoringip.monitoringip.model.device.Device;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "mfu_counter_page_report")
public class MfuCounterPageReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer pageCounter;

    @NotNull
    private LocalDateTime reportTime = LocalDateTime.now();

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    private Device device;
}
