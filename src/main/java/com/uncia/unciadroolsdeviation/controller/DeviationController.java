package com.uncia.unciadroolsdeviation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.unciadroolsdeviation.model.Participant;
import com.uncia.unciadroolsdeviation.model.Rate;
import com.uncia.unciadroolsdeviation.service.DeviationService;

@RestController()
@RequestMapping("/ruleservice")
public class DeviationController {

	@Autowired
	 private DeviationService deviationService;
	 
	 @PostMapping("/getrate")
	 public ResponseEntity<Rate> getRate(@RequestBody Participant request){
	  Rate rate = deviationService.getRate(request);
	  return new ResponseEntity<>(rate, HttpStatus.OK);
	 }
}
