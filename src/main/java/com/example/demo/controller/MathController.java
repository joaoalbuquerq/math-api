package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtract(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiply(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
	}
	@RequestMapping(value = "/squareRoot/{numberOne}", method=RequestMethod.GET)
	public Double squareRoot(
			@PathVariable(value = "numberOne") String numberOne
			) throws Exception{
		
		if(!isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return Math.sqrt(convertToDouble(numberOne));
	}

	private Double convertToDouble(String number) {
		if(number == null) return 0D;
	
		String numberFormatado = number.replaceAll(",", ".");
		if(isNumeric(numberFormatado)) return Double.parseDouble(numberFormatado);
		return 0D;

	}

	private boolean isNumeric(String number) {
		if(number == null) return false;
		String numberFormat = number.replaceAll("," , ".");
		return numberFormat.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	
}
