package com.ilkaygunel.carfactory.api;

import com.ilkaygunel.carfactory.exception.NotSupportedCarTypeException;
import com.ilkaygunel.carfactory.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarAPI {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET, value = "/car/{type}")
    public ResponseEntity<String> getTypeOutput(@PathVariable String type) throws NotSupportedCarTypeException {
        String result = carService.getCarTypeResult(type);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
