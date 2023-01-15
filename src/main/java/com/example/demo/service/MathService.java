package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.UnsupportedMathOperationException;
import com.example.demo.format.NumberFormater;

@Service
public class MathService {

	@Autowired
	private MathServiceImplements mathServiceImplements;
	
	public double sum(String numberOne, String numberTwo) {
		
		if(NumberFormater.isNumeric(numberOne) || NumberFormater.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.sum(NumberFormater.convertToDouble(numberOne), NumberFormater.convertToDouble(numberTwo));
	}
	public double subtract(String numberOne, String numberTwo) {
		if(NumberFormater.isNumeric(numberOne) || NumberFormater.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.subtract(NumberFormater.convertToDouble(numberOne), NumberFormater.convertToDouble(numberTwo));
	}
	public double multiply(String numberOne, String numberTwo) {
		
		if(NumberFormater.isNumeric(numberOne) || NumberFormater.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.multiply(NumberFormater.convertToDouble(numberOne), NumberFormater.convertToDouble(numberTwo));
	}
	public double division(String numberOne, String numberTwo) {
		
		if(NumberFormater.isNumeric(numberOne) || NumberFormater.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.divide(NumberFormater.convertToDouble(numberOne), NumberFormater.convertToDouble(numberTwo));
	}
	public double average(String numberOne, String numberTwo) {
		
		if(NumberFormater.isNumeric(numberOne) || NumberFormater.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.average(NumberFormater.convertToDouble(numberOne), NumberFormater.convertToDouble(numberTwo));
	}
	public double squareRoot(String numberOne) {
		
		if(NumberFormater.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mathServiceImplements.squareRoot(NumberFormater.convertToDouble(numberOne));
	}
	
}
