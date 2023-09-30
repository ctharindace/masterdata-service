package com.chethiya.masterdata.dao.repository;

import com.chethiya.masterdata.model.Complexion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexionRepository extends JpaRepository<Complexion, String> {

    Complexion findByComplexionCode(String complexionCode);

}
