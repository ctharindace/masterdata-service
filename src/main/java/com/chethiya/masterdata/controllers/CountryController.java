package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.CountryDTO;
import com.chethiya.masterdata.services.CommonService;
import com.chethiya.masterdata.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController extends CommonController<CountryDTO, String>{

    @Autowired
    private CountryService countryService;

    @Override
    CommonService<CountryDTO, String> getService() {
        return this.countryService;
    }
}
