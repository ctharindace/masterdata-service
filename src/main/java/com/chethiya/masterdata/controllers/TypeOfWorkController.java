package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.TypeOfWorkDTO;
import com.chethiya.masterdata.services.CommonService;
import com.chethiya.masterdata.services.TypeOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("typeOfWork")
public class TypeOfWorkController extends CommonController<TypeOfWorkDTO, String> {

    @Autowired
    private TypeOfWorkService typeOfWorkService;

    @Override
    CommonService<TypeOfWorkDTO, String> getService() {
        return this.typeOfWorkService;
    }
}
