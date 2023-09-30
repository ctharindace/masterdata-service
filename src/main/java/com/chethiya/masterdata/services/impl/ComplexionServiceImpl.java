package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.ComplexionRepository;
import com.chethiya.masterdata.dto.ComplexionDTO;
import com.chethiya.masterdata.model.Complexion;
import com.chethiya.masterdata.services.ComplexionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplexionServiceImpl implements ComplexionService {

    @Autowired
    private ComplexionRepository complexionRepository;

    @Override
    public ComplexionDTO saveEntity(ComplexionDTO complexionDTO) {
        Complexion maritalStatus = complexionRepository.save(getEntity(complexionDTO, new Complexion()));
        return getDto(maritalStatus);
    }

    @Override
    public ComplexionDTO getEntity(String statusCode) {
        Complexion maritalStatus = complexionRepository.findByComplexionCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public ComplexionDTO updateEntity(ComplexionDTO complexionDTO) {
        Complexion maritalStatus = complexionRepository.findByComplexionCode(complexionDTO.getComplexionCode());
        return getDto(complexionRepository.save(getEntity(complexionDTO, maritalStatus)));
    }

    private Complexion getEntity(ComplexionDTO dto, Complexion model) {
        if (model == null) {
            model = new Complexion();
        }
        model.setDescription(dto.getDescription());
        model.setComplexionCode(dto.getComplexionCode());
        return model;
    }

    private ComplexionDTO getDto(Complexion model) {
        ComplexionDTO dto = new ComplexionDTO();
        dto.setDescription(model.getDescription());
        dto.setComplexionCode(model.getComplexionCode());
        return dto;
    }
}
