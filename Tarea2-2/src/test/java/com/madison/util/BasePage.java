package com.madison.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class BasePage{
	
	WebDriver driver;
	WebDriverWait wait;
	int timeoutSec = 15;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
	}
	
	public void setTimeoutSec(int timeoutSec) {
		this.timeoutSec = timeoutSec;
	}
	
	public void visit(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSec));
		driver.get(url);
	}
	
	public WebElement find(By element) {
		return driver.findElement(element);
	}
	
	public void click(By element) {
		find(element).click();
	}
	
	public void Submit (By element) {
		find(element).submit();
	}
	
	public void type(By element, String text) {
		find(element).sendKeys(text);
	}

	public boolean isDisplayed(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch  (TimeoutException e) {
			return false;
		}
		return true;
	}
	
	public void MessageOutpot (String error) {
		System.out.print(error+"\n");
	}
	
}