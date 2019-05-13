package com.train.batchtrain.util;

import org.springframework.stereotype.Component;
import java.util.HashMap;


@Component
public class Configuration {
   
	/* Charge the information of the possible routes
	 */
    static public HashMap<String, Integer>  getRoutes(){
    	HashMap<String, Integer> routes = new HashMap<String, Integer>();
    	routes.put("AB",5);
    	routes.put("BC",4);
    	routes.put("CD",8);
    	routes.put("DC",8);
    	routes.put("DE",6);
    	routes.put("AD",5);
    	routes.put("CE",2);
    	routes.put("EB",3);
    	routes.put("AE",7);
    	
    	return routes;
    }
}
  
