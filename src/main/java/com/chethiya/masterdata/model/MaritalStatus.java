package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MASTER_T_MARITAL_STATUS")
public class MaritalStatus {

    @Id
    @Column(name="STATUS_CODE")
    private String statusCode;

    @Column(name="STATUS_NAME")
    private String statusName;

    @Column(name="DESCRIPTION")
    private String description;

}
