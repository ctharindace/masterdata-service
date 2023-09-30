package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.FieldOfWorkRepository;
import com.chethiya.masterdata.dto.FieldOfWorkDTO;
import com.chethiya.masterdata.model.FieldOfWork;
import com.chethiya.masterdata.services.FieldOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldOfWorkServiceImpl implements FieldOfWorkService {

    @Autowired
    private FieldOfWorkRepository fieldOfWorkRepository;

    @Override
    public FieldOfWorkDTO saveEntity(FieldOfWorkDTO fieldOfWorkDTO) {
        FieldOfWork maritalStatus = fieldOfWorkRepository.save(getEntity(fieldOfWorkDTO, new FieldOfWork()));
        return getDto(maritalStatus);
    }

    @Override
    public FieldOfWorkDTO getEntity(String statusCode) {
        FieldOfWork maritalStatus = fieldOfWorkRepository.findByFieldCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public FieldOfWorkDTO updateEntity(FieldOfWorkDTO fieldOfWorkDTO) {
        FieldOfWork maritalStatus = fieldOfWorkRepository.findByFieldCode(fieldOfWorkDTO.getFieldCode());
        return getDto(fieldOfWorkRepository.save(getEntity(fieldOfWorkDTO, maritalStatus)));
    }

    private FieldOfWork getEntity(FieldOfWorkDTO dto, FieldOfWork model) {
        if (model == null) {
            model = new FieldOfWork();
        }
        model.setFieldCode(dto.getFieldCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        return model;
    }

    private FieldOfWorkDTO getDto(FieldOfWork model) {
        FieldOfWorkDTO dto = new FieldOfWorkDTO();
        dto.setFieldCode(model.getFieldCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        return dto;
    }
}
