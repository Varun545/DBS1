package com.dbs.remorides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.remorides.model.RemoRidesRequestModel;
import com.dbs.remorides.model.RemoRidesResponseModel;
import com.dbs.remorides.service.RemoRidesService;

@RestController
@ComponentScan(basePackages = {"com.dbs"})
public class RemoRIdesController {

	@Autowired
	RemoRidesService remoRidesService;
	
	@Autowired
	RemoRidesResponseModel remoRidesResponseModel;
	
		@RequestMapping(value="/setDetails",method=RequestMethod.POST)
		public RemoRidesResponseModel setDetails(@RequestBody RemoRidesRequestModel remoRidesRequestModel ) {
		
		remoRidesService.setDetails(remoRidesRequestModel);
		
		return remoRidesResponseModel;
		
	}
}
