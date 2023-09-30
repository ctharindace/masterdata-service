package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.GenderRepository;
import com.chethiya.masterdata.dto.GenderDTO;
import com.chethiya.masterdata.model.Gender;
import com.chethiya.masterdata.services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    private GenderRepository genderRepository;

    @Override
    public GenderDTO saveEntity(GenderDTO genderDTO) {
        Gender maritalStatus = genderRepository.save(getEntity(genderDTO, new Gender()));
        return getDto(maritalStatus);
    }

    @Override
    public GenderDTO getEntity(String statusCode) {
        Gender maritalStatus = genderRepository.findByGenderCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public GenderDTO updateEntity(GenderDTO genderDTO) {
        Gender maritalStatus = genderRepository.findByGenderCode(genderDTO.getGenderCode());
        return getDto(genderRepository.save(getEntity(genderDTO, maritalStatus)));
    }

    private Gender getEntity(GenderDTO dto, Gender model) {
        if (model == null) {
            model = new Gender();
        }
        model.setGenderCode(dto.getGenderCode());
        model.setName(dto.getName());
        return model;
    }

    private GenderDTO getDto(Gender model) {
        GenderDTO dto = new GenderDTO();
        dto.setGenderCode(model.getGenderCode());
        dto.setName(model.getName());
        return dto;
    }
}
