package com.maddinsson;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleReport<ExtendSparkReporter, ExtentSparkReporter, ExtentReports, ExtentTest> {
	
	ExtentSparkReporter report;
	ExtentReports extend;
	ExtentTest test;
	
  @BeforeTest
  public void startReport() {
		
  }
	
  /**
 * 
 */
@Test
  public void test_1() {
	  
  }
  
  
  @AfterTest
  public void tearDown() {
	  
  }
  
}
