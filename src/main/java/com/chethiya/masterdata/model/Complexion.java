package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MASTER_T_COMPLEXION")
public class Complexion {

    @Id
    @Column(name="COMPLEXION_CODE")
    private String complexionCode;

    @Column(name="DESCRIPTION")
    private String description;
}
