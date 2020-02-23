package com.monitoringip.monitoringip.model.access;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@Accessors(chain = true)
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private Long id;

    @Column(name = "first_name")
    @Size(max = 255)
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 255)
    private String lastName;

    @Column(name = "email")
    @Size(max = 255)
    private String email = "";

    @Column(name = "phone_number")
    @Size(max = 10)
    private Integer phoneNumber;

    @Column(name = "tlg_chat_id")
    private Integer tlgChatId;

    @Size(max = 255)
    private String password;

    @Column(columnDefinition = "boolean default true")
    private Boolean enabled = true;

}
