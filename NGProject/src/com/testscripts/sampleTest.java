package com.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	
	
	// sequence of annotation 
	
	
	
	@BeforeTest
	public void setupTest() {
		
	System.out.println("This is before Test");	
		
	}
	
	
	
	
	
	@Test
	public void aloginTest() {
		
		
		
		Assert.assertEquals("Michael", "Michael");
		System.out.println("This is A Test");
		
	}
	
	@Test
	public void bTitleValidation() {
		
		
		Assert.assertEquals("Michael", "test");
		System.out.println("This is B Test");
		
	}
	
	
	@BeforeMethod
	public void setEachTest() {
		
		System.out.println("This is before method");
		
	}
	
	@AfterMethod
	public void endEachTest() {
		
		System.out.println("This is after method");
		
	}
	
	@AfterTest
	public void finishTest() {
		
		System.out.println("This is after Test");
		
	}
	
	
	
	
	
	
	
	
	
	

}
