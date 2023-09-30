package com.chethiya.masterdata.dao.repository;

import com.chethiya.masterdata.model.MaritalStatus;
import com.chethiya.masterdata.model.WorkGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, String> {

    MaritalStatus findByStatusCode(String statusCode);

}
