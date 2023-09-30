package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MASTER_T_FIELD_OF_WORK")
public class FieldOfWork {

    @Id
    @Column(name="FIELD_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MASTER_S_FIELD_OF_WORK")
    @SequenceGenerator(sequenceName = "MASTER_S_FIELD_OF_WORK", name="MASTER_S_FIELD_OF_WORK", allocationSize = 1)
    private Integer fieldId;

    @Column(name="FIELD_CODE", unique = true)
    private String fieldCode;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DESCRIPTION")
    private String description;
    
}
