package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Actionwords {
	
		@Test
	    public void shouldReturnTheAverage() {
	    	Funcao test1 = new Funcao();
	    	int[] a = {1,2,3,4,5};
	    	double result = test1.average(a);
	    	assertEquals(3.0,result);
	    }
		@Test
	    public void shouldReturnTheMaximumNumber() {
	    	Funcao test1 = new Funcao();
	    	int[] a = {1,2,3,4,5};
	    	int result = test1.maximum(a);
	    	assertEquals(5,result);
	    }
		@Test
	    public void shouldReturnTheMinimumNumber() {
	    	Funcao test1 = new Funcao();
	    	int[] a = {1,2,3,4,5};
	    	double result = test1.minimum(a);
	    	assertEquals(1,result);
	    }
}