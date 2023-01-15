package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImplements {

	public double sum(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}
	public double subtract(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}
	public double multiply(double numberOne, double numberTwo) {
		return numberOne * numberTwo;
	}
	public double divide(double numberOne, double numberTwo) {
		return numberOne / numberTwo;
	}
	public double average(double numberOne, double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	public double squareRoot(double numberOne) {
		return Math.sqrt(numberOne);
	}
	
}
