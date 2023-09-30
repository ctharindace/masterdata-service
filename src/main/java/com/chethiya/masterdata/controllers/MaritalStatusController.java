package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.MaritalStatusDTO;
import com.chethiya.masterdata.services.CommonService;
import com.chethiya.masterdata.services.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("maritalStatus")
public class MaritalStatusController extends CommonController<MaritalStatusDTO, String>{

    @Autowired
    private MaritalStatusService maritalStatusService;

    @Override
    CommonService<MaritalStatusDTO, String> getService() {
        return this.maritalStatusService;
    }
}
