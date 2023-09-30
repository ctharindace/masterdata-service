package com.chethiya.masterdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MASTER_T_WORK_TYPE")
public class TypeOfWork {

    @Id
    @Column(name="WORK_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MASTER_S_WORK_TYPE")
    @SequenceGenerator(name = "MASTER_S_WORK_TYPE", sequenceName = "MASTER_S_WORK_TYPE", allocationSize = 1)
    private Integer workTypeId;

    @Column(name="WORK_TYPE_CODE", unique = true)
    private String workTypeCode;

    @Column(name="WORK_TYPE_NAME")
    private String workTypeName;

    @ManyToOne
    @JoinColumn(name = "FIELD_ID")
    private FieldOfWork fieldOfWork;

    @ManyToOne
    @JoinColumn(name = "GRADE_ID")
    private WorkGrade workGrade;

}
