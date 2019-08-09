package com.pulic.springboot.elk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pulic.springboot.elk.model.City;
import com.pulic.springboot.elk.service.ICityService;

@RestController
@RequestMapping("/")
public class SignupController {
	
	 @Autowired
	    private ICityService cityService;

	    @GetMapping(value = "/cities")
	    public List<City> getCities() {

	        List<City> cities = cityService.findAll();

	        return cities;
	    }
}
