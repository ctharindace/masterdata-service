package com.chethiya.masterdata.dao.repository;

import com.chethiya.masterdata.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender, String> {

    Gender findByGenderCode(String genderCode);

}
