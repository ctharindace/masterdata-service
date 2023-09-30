package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MASTER_T_COUNTRY")
public class Country {

    @Id
    @Column(name="COUNTRY_CODE")
    private String countryCode;

    @Column(name="COUNTRY_NAME")
    private String name;

    @Column(name="NATIONALITY")
    private String nationality;

}
