package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MASTER_T_GENDER")
public class Gender {

    @Id
    @Column(name="GENDER_CODE")
    private String genderCode;

    @Column(name="NAME")
    private String name;

}
