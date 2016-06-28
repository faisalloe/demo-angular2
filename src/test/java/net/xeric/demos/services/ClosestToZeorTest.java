package net.xeric.demos.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ClosestToZeorTest {
    
	private NumberService numberService = new NumberService();
	

    @Test
    public void testNumberCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(1);
    	numbers.add(2);
    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertTrue(minNumber == 1);
    	
    }

    
    @Test
    public void testRandomNumberCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(3);
    	numbers.add(2);
    	numbers.add(5);
    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertTrue(minNumber == 2);
    	
    }
    
    
    @Test
    public void testDupNumberCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(3);
    	numbers.add(2);
    	numbers.add(2);
    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertTrue(minNumber == 2);
    	
    }
    
    
    @Test
    public void testNegativeNumberCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(2);
    	numbers.add(-1);
    	numbers.add(3);
    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertEquals(-1, minNumber);
    }
    
    @Test
    public void testRandomNegativeNumbersCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(-2);
    	numbers.add(1);
    	numbers.add(-3);
    	numbers.add(4);
    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertEquals(1, minNumber);
    }
    
    @Test
    public void testNumbersCloseToZero() throws Exception {
    	
    	List<Integer> numbers = new ArrayList<Integer>(5);
    	numbers.add(-2);
    	numbers.add(0);

    	
    	int minNumber =numberService.findNumberClosestToZero(numbers);
    	Assert.assertEquals(0, minNumber);
    }
    
    
}