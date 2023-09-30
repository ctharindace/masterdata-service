package com.chethiya.masterdata.dao.repository;


import com.chethiya.masterdata.model.TypeOfWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfWorkRepository extends JpaRepository<TypeOfWork, Integer> {

    TypeOfWork findByWorkTypeCode(String workTypeCode);

}
