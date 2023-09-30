package com.chethiya.masterdata.dao.repository;


import com.chethiya.masterdata.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCountryCode(String countryCode);

}
