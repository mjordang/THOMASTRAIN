package com.train.batchtrain.process;

import static com.train.batchtrain.util.Configuration.getRoutes;

import com.train.batchtrain.process.Routes;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class RoutesTest {
	
	private HashMap<String,Integer> routes = getRoutes();
	
	private  Routes route = new Routes();
	
	@Test
    public  void calculate_route_distance9()throws Exception {
        String [] cities = {"A","B","C"};
        Assert.assertEquals(9,route.calculateRoute(cities));
    }
	  
	@Test
    public  void calculate_route_distance5() throws Exception{
        String [] cities = {"A","B"};
        Assert.assertEquals(5,route.calculateRoute(cities));
    }
	 
	@Test
    public  void calculate_route_distance13() throws Exception{
        String [] cities = {"A","D","C"};
        Assert.assertEquals(13,route.calculateRoute(cities));
    }
	
	@Test
    public  void calculate_route_distance22() throws Exception{
        String [] cities = {"A","E","B","C","D"};
        Assert.assertEquals(22,route.calculateRoute(cities));
    }
	
	@Test
    public  void calculate_route_distance_no_such_route()throws Exception {
        String [] cities = {"A","E","D"};
        Assert.assertEquals(0,route.calculateRoute(cities));
    }
	
}
