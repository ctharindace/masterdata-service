package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.CountryRepository;
import com.chethiya.masterdata.dto.CountryDTO;
import com.chethiya.masterdata.model.Country;
import com.chethiya.masterdata.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public CountryDTO saveEntity(CountryDTO countryDTO) {
        Country maritalStatus = countryRepository.save(getEntity(countryDTO, new Country()));
        return getDto(maritalStatus);
    }

    @Override
    public CountryDTO getEntity(String statusCode) {
        Country maritalStatus = countryRepository.findByCountryCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public CountryDTO updateEntity(CountryDTO countryDTO) {
        Country maritalStatus = countryRepository.findByCountryCode(countryDTO.getCountryCode());
        return getDto(countryRepository.save(getEntity(countryDTO, maritalStatus)));
    }

    private Country getEntity(CountryDTO dto, Country model) {
        if (model == null) {
            model = new Country();
        }
        model.setCountryCode(dto.getCountryCode());
        model.setName(dto.getName());
        model.setNationality(dto.getNationality());
        return model;
    }

    private CountryDTO getDto(Country model) {
        CountryDTO dto = new CountryDTO();
        dto.setCountryCode(model.getCountryCode());
        dto.setName(model.getName());
        dto.setNationality(model.getNationality());
        return dto;
    }
}
