package com.chethiya.masterdata.dao.repository;

import com.chethiya.masterdata.model.WorkGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkGradeRepository extends JpaRepository<WorkGrade, Integer> {

    WorkGrade findByGradeCode(String gradeCode);

}
