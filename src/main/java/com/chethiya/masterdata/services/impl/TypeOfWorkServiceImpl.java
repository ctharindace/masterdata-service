package com.chethiya.masterdata.services.impl;

import com.chethiya.masterdata.dao.repository.FieldOfWorkRepository;
import com.chethiya.masterdata.dao.repository.TypeOfWorkRepository;
import com.chethiya.masterdata.dao.repository.WorkGradeRepository;
import com.chethiya.masterdata.dto.TypeOfWorkDTO;
import com.chethiya.masterdata.model.TypeOfWork;
import com.chethiya.masterdata.services.TypeOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfWorkServiceImpl implements TypeOfWorkService {

    @Autowired
    private TypeOfWorkRepository typeOfWorkRepository;

    @Autowired
    private FieldOfWorkRepository fieldOfWorkRepository;

    @Autowired
    private WorkGradeRepository workGradeRepository;

    @Override
    public TypeOfWorkDTO saveEntity(TypeOfWorkDTO typeOfWorkDTO) {
        TypeOfWork maritalStatus = typeOfWorkRepository.save(getEntity(typeOfWorkDTO, new TypeOfWork()));
        return getDto(maritalStatus);
    }

    @Override
    public TypeOfWorkDTO getEntity(String statusCode) {
        TypeOfWork maritalStatus = typeOfWorkRepository.findByWorkTypeCode(statusCode);
        return getDto(maritalStatus);
    }

    @Override
    public TypeOfWorkDTO updateEntity(TypeOfWorkDTO typeOfWorkDTO) {
        TypeOfWork maritalStatus = typeOfWorkRepository.findByWorkTypeCode(typeOfWorkDTO.getWorkTypeCode());
        return getDto(typeOfWorkRepository.save(getEntity(typeOfWorkDTO, maritalStatus)));
    }

    private TypeOfWork getEntity(TypeOfWorkDTO dto, TypeOfWork model) {
        if (model == null) {
            model = new TypeOfWork();
        }
        model.setWorkTypeCode(dto.getWorkTypeCode());
        model.setWorkTypeName(dto.getWorkTypeName());
        model.setFieldOfWork(fieldOfWorkRepository.findByFieldCode(dto.getFieldCode()));
        model.setWorkGrade(workGradeRepository.findByGradeCode(dto.getGradeCode()));
        return model;
    }

    private TypeOfWorkDTO getDto(TypeOfWork model) {
        TypeOfWorkDTO dto = new TypeOfWorkDTO();
        dto.setWorkTypeCode(model.getWorkTypeCode());
        dto.setWorkTypeName(model.getWorkTypeName());
        dto.setFieldCode(model.getFieldOfWork().getFieldCode());
        dto.setGradeCode(model.getWorkGrade().getGradeCode());
        return dto;
    }
}
