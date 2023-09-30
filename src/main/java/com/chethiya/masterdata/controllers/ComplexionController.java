package com.chethiya.masterdata.controllers;

import com.chethiya.masterdata.dto.ComplexionDTO;
import com.chethiya.masterdata.dto.ComplexionDTO;
import com.chethiya.masterdata.services.ComplexionService;
import com.chethiya.masterdata.services.ComplexionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("complexion")
public class ComplexionController {

    @Autowired
    private ComplexionService complexionService;

    @ResponseBody
    @RequestMapping(path = "/put", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ComplexionDTO addComplexion(@RequestBody ComplexionDTO complexionDTO) {
        return complexionService.saveEntity(complexionDTO);
    }

    @ResponseBody
    @RequestMapping(path = "/get/{statusCode}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ComplexionDTO getComplexion(@PathVariable(name = "statusCode") String complexion) {
        return complexionService.getEntity(complexion);
    }

    @ResponseBody
    @RequestMapping(path = "/post", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ComplexionDTO updateComplexion(@RequestBody ComplexionDTO complexionDTO) {
        return complexionService.updateEntity(complexionDTO);
    }
}
