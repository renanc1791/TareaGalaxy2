package com.madison.pages;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.madison.util.BasePage;

public class RegisterPage extends BasePage{
  
	
	By Inputfirstname    = By.id("firstname");
	By InputMiddlename   = By.id("middlename");
	By InputLastname     = By.id("lastname");
	By InputEmail_address= By.id("email_address");
	By InputPassword     = By.id("password");
	By InputConfirmation = By.id("confirmation");
	
	By SubmitButton 	 = By.xpath("//*[@id=\"form-validate\"]/div[2]/button");
	By successRegister   = By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div");
	
	By Account   		 = By.xpath("//*[@id=\"header\"]/div/div[2]/div/a");
	By Account_Logout    = By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a");
	By Account_Login     = By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a");
	
	By LoginEmail    = By.id("email");
	By LoginPassword = By.id("pass");
	By LoginButton   = By.name("send");
	
	By InputSearch = By.id("search");
	By SubmitSearch = By.xpath("//*[@id=\"search_mini_form\"]/div[1]/button");
	By lnk_AddWishList = By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/ul/li/div/div[2]/ul/li[1]/a");
	
	String url = "http://demo-store.seleniumacademy.com/customer/account/create/";

	
	public RegisterPage(WebDriver driver) {
		super(driver);
		visit(url);
	}
	
	public void newAccount(String firstname,String middlename,String lastname,
			String email_address,String password,String confirmation) {
		
		type(Inputfirstname,firstname);
		type(InputMiddlename,middlename);
		type(InputLastname,lastname);
		type(InputEmail_address,email_address);
		type(InputPassword,password);
		type(InputConfirmation,confirmation);
		
		Submit(SubmitButton);
  }
	
	public void Login (String email, String password) {
		type(LoginEmail,email);
		type(LoginPassword, password);
		Submit(LoginButton);
	}
	
	public void Search(String search) {
		type(InputSearch, search);
		Submit(SubmitSearch);
	}
	
	public boolean succesRegister() {
		return isDisplayed(successRegister);
	}

	public void AccountClick() {
		click(Account);
	}	
	
	public void AccountLogout() {
		AccountClick();
		click(Account_Logout); 
	}
	
	public void AccountLogin() {
		AccountClick();
		click(Account_Login);
	}

	public void AddWishList() {
		click(lnk_AddWishList);
	}
	
}
 