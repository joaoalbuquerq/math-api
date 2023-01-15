package com.example.demo.format;

public class NumberFormater {
	
	public static Double convertToDouble(String number) {
		if(number == null) return 0D;
	
		String numberFormatado = number.replaceAll(",", ".");
		if(isNumeric(numberFormatado)) return Double.parseDouble(numberFormatado);
		return 0D;

	}

	public static boolean isNumeric(String number) {
		if(number == null) return false;
		String numberFormat = number.replaceAll("," , ".");
		return numberFormat.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
