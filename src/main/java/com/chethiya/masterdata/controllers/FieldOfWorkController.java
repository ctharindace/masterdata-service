package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.FieldOfWorkDTO;
import com.chethiya.masterdata.model.FieldOfWork;
import com.chethiya.masterdata.services.CommonService;
import com.chethiya.masterdata.services.FieldOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fieldOfWork")
public class FieldOfWorkController extends CommonController<FieldOfWorkDTO, String>{

    @Autowired
    private FieldOfWorkService fieldOfWorkService;

    @Override
    CommonService<FieldOfWorkDTO, String> getService() {
        return this.fieldOfWorkService;
    }
}
