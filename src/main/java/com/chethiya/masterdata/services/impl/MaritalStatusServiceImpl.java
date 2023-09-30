package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.MaritalStatusRepository;
import com.chethiya.masterdata.dto.MaritalStatusDTO;
import com.chethiya.masterdata.model.MaritalStatus;
import com.chethiya.masterdata.services.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {

    @Autowired
    private MaritalStatusRepository maritalStatusRepository;

    @Override
    public MaritalStatusDTO saveEntity(MaritalStatusDTO maritalStatusDTO) {
        MaritalStatus maritalStatus = maritalStatusRepository.save(getEntity(maritalStatusDTO, new MaritalStatus()));
        return getDto(maritalStatus);
    }

    @Override
    public MaritalStatusDTO getEntity(String statusCode) {
        MaritalStatus maritalStatus = maritalStatusRepository.findByStatusCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public MaritalStatusDTO updateEntity(MaritalStatusDTO maritalStatusDTO) {
        MaritalStatus maritalStatus = maritalStatusRepository.findByStatusCode(maritalStatusDTO.getStatusCode());
        return getDto(maritalStatusRepository.save(getEntity(maritalStatusDTO, maritalStatus)));
    }

    private MaritalStatus getEntity(MaritalStatusDTO dto, MaritalStatus model) {
        if (model == null) {
            model = new MaritalStatus();
        }
        model.setDescription(dto.getDescription());
        model.setStatusCode(dto.getStatusCode());
        model.setStatusName(dto.getStatusName());
        return model;
    }

    private MaritalStatusDTO getDto(MaritalStatus model) {
        MaritalStatusDTO dto = new MaritalStatusDTO();
        dto.setDescription(model.getDescription());
        dto.setStatusCode(model.getStatusCode());
        dto.setStatusName(model.getStatusName());
        return dto;
    }
}
