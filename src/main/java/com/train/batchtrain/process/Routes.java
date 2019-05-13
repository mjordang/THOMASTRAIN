package com.train.batchtrain.process;

import static com.train.batchtrain.util.Configuration.getRoutes;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Routes {
	
	private static final Logger log = LoggerFactory.getLogger(Routes.class);
    
	
	/*Preparing the routes's data, we assume that the available rutes are only the ones
	 * named in the statement of the exercise
	 **/
	private HashMap<String,Integer> routes = getRoutes();
	
	
	/*Function which calculate the route
	 * Params: route's cities' names
	 * Result: the total distnace of the route
	 */
	public int calculateRoute(String[] cities) throws Exception{
		log.info("========================= Starting with route calculation =========================");
		int distance = 0;
		String key = null;
		try {
			for (int i=0;i<cities.length; i++){
				if (i+1 < cities.length){
					key = cities[i]+cities[i+1];
				      if(routes.containsKey(key)){
				    	  	distance += routes.get(key).intValue();
				      }else{
				    	  distance = 0;
				    	  break;
				      }
				}
			}
		
		} catch (Exception e) {
	            log.error("Errors calculating the route");
	            throw e;
		}
		return distance;
		
	}
	
}
