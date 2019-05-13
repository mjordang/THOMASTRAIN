package com.train.batchtrain.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class ValidationTest {
    private Validations validations = new Validations();
  
    @Test
    public  void verify_isValidCity() {
        String [] cities = {"A","B","C"};
        Assert.assertTrue(validations.isValidCity(cities));
    }

    @Test
    public void verify_isNotValidCity() {
    	String [] cities = {"A","B","C","F"};
    	Assert.assertFalse(validations.isValidCity(cities));
    }
    
    @Test
    public  void verify_isValidCity_2() {
    	String city = "D";
        Assert.assertTrue(validations.isValidCity(city));
    }

    @Test
    public void verify_isNotValidCity_2() {
    	String city = "H";
    	Assert.assertFalse(validations.isValidCity(city));
    }
    
}
   
