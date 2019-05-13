package com.train.batchtrain.util;

public class Validations {
	
	/*
	 * Validates that the cities in the route are valid
	 * Params: route's cities' names
	 * Result: a boolean indicating if the cities are valid or not
	 */
	public static boolean isValidCity(String [] cities){
		for (String city : cities) {
			if (!isValidCity(city)){
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * Validates that city selected is a city existent in current routes
	 * Params: city name
	 * Result: a boolean indicating if the cities is valid or not
	 */
	public static boolean isValidCity(String city){
		if(!city.matches("A|B|C|D|E"))
		{
		 return false;	
		}
		
		return true;
		
	}

}
