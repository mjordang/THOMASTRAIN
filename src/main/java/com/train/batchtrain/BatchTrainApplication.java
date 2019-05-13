package com.train.batchtrain;

import static com.train.batchtrain.util.Validations.isValidCity;

import com.train.batchtrain.exception.Errors;
import com.train.batchtrain.process.Routes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static java.lang.System.exit;

@SpringBootApplication
public class BatchTrainApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(BatchTrainApplication.class);
    
    @Autowired
    private Routes routes;
    
    public static void main(String[] args) {
        SpringApplication.run(BatchTrainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	
    	/*We assume that the users will enter the routes using "-" as a separations character
    	 * between cities and all the names in capital letters
    	 */
    	String[] cities = null;
    	
    	if (args == null || args.length == 0){
    		log.error(Errors.ILLEGAL_NUMBER_ARGUMENTS.getDescription());
    		exit(0);
    	}else{
    		cities = args[0].split("-");
    		if (cities.length < 2){
        		log.error(Errors.ILLEGAL_NUMBER_ARGUMENTS.getDescription());
        		exit(0);
        	}else if(!isValidCity(cities)){
        		log.error(Errors.ILLEGAL_ARGUMENTS.getDescription());
        		exit(0);
        	}
    		
    	}
    	
        
        log.info("========================= Starting =========================");
        log.info("==========================================================================");

        try {
        	int distance = routes.calculateRoute(cities);
        	if (distance > 0){
        		log.info("=============== The distance of your route is:" + distance + " ===============");
        	}
        	else {
        		log.info("========================= NO SUCH ROUTE'. Please use the most direct route and do not make any extra stops  =========================");
        	}
            
        } catch (Exception ex) {
            log.error("{} - {}", ex.getCause(), ex.getMessage());
        } finally {
            if (log.isInfoEnabled()) {
                log.info("=============== Process finalized===============");
            }
            exit(0);
        }
    }
}
