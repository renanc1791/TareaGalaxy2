package com.madison.tests;

import org.testng.annotations.Test;

import com.madison.pages.RegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class RegistrarUserTest {
	
	WebDriver driver;
	RegisterPage register;
	
  @BeforeTest
  public void setup() {
	driver = WebDriverManager.chromedriver().create();
	register = new RegisterPage(driver);
  }
	
  @Test
  public void testRegisterSuccess() {
	  
	  String email    = "renanc32@gmail.com";
	  String password = "qweasd"; 
	  
	    register.newAccount("Renan","A.","Chacaliaza", email,password,password);
		assertTrue(register.succesRegister());	  
		
		register.AccountLogout();
		register.AccountLogin();
		
		register.Login(email,password);
		register.MessageOutpot("Datos de sesion iniciados");
		
		register.Search("tori");
		register.MessageOutpot("tori search..");
		
		register.AddWishList();
		register.MessageOutpot("wishlist added");
  }

  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}
