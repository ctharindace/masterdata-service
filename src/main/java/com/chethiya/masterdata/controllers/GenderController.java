package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.GenderDTO;
import com.chethiya.masterdata.services.CommonService;
import com.chethiya.masterdata.services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gender")
public class GenderController extends CommonController<GenderDTO, String> {

    @Autowired
    private GenderService genderService;

    @Override
    CommonService<GenderDTO, String> getService() {
        return this.genderService;
    }
}
