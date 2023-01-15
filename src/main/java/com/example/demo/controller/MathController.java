package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MathService;

@RestController
public class MathController {
	
	@Autowired
	private MathService mathService;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	){
		return mathService.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtract(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	){
		return mathService.subtract(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiply(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	){
		return mathService.multiply(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	){
		return mathService.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	){
		return mathService.average(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/squareRoot/{numberOne}", method=RequestMethod.GET)
	public Double squareRoot(
		@PathVariable(value = "numberOne") String numberOne
	) {
		return mathService.squareRoot(numberOne);
	}
	
}
