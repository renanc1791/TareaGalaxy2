package com.madison.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.madison.util.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopingTest {
	
	WebDriver driver;

  @Test (priority = 1)
  public void AddShopingCart1() {
	  System.out.println("Adding first product");
	  
	  //Seleccionar 1 item
	  WebElement seleccionarItem = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
	  Highlighter.highlightElement(driver, seleccionarItem);
	  seleccionarItem.click();
	  
	  WebElement seleccionarColor = driver.findElement(By.xpath("//*[@id=\"swatch20\"]"));
	  Highlighter.highlightElement(driver, seleccionarColor);
	  seleccionarColor.click();
	  
	  WebElement seleccionarTalla = driver.findElement(By.xpath("//*[@id=\"swatch80\"]"));
	  Highlighter.highlightElement(driver, seleccionarTalla);
	  seleccionarTalla.click();

	  WebElement bntAgregar = driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button"));
	  Highlighter.highlightElement(driver, bntAgregar);
	  bntAgregar.submit();
	  
	  WebElement bntSeguirComprando = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tfoot/tr/td/button[4]"));
	  Highlighter.highlightElement(driver, bntSeguirComprando);
	  bntSeguirComprando.click();
	  
	  WebElement IrAInicio = driver.findElement(By.xpath("//*[@id=\"header\"]/div/a"));
	  Highlighter.highlightElement(driver, IrAInicio);
	  IrAInicio.click();
	 
	  //Agregar segundo producto
  	  


	  
	  //Seleccionar 1 item
	  WebElement seleccionarItem2 = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[1]/a"));
	  Highlighter.highlightElement(driver, seleccionarItem2);
	  seleccionarItem2.click();
	  
	  WebElement seleccionarColor2 = driver.findElement(By.xpath("//*[@id=\"swatch22\"]"));
	  Highlighter.highlightElement(driver, seleccionarColor2);
	  seleccionarColor2.click();
	  
	  WebElement seleccionarTalla2 = driver.findElement(By.xpath("//*[@id=\"swatch80\"]"));
	  Highlighter.highlightElement(driver, seleccionarTalla2);
	  seleccionarTalla2.click();

	  WebElement bntAgregar2 = driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button"));
	  Highlighter.highlightElement(driver, bntAgregar2);
	  bntAgregar2.submit();

	  System.out.println("Second product added");
	  
	 //Proceder al Checkout 
	  WebElement btnProccedToCheckout= driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[3]/div/ul/li/button"));
	  Highlighter.highlightElement(driver, btnProccedToCheckout);  
	  btnProccedToCheckout.click();
	  
	  System.out.println("Adding - btnProccedToCheckout");	  
	  
	  WebElement textCorreo = driver.findElement(By.id("login-email"));
	  Highlighter.highlightElement(driver, textCorreo);
	  textCorreo.sendKeys("renanc32@gmail.com");
	  WebElement textPass = driver.findElement(By.id("login-password"));
	  Highlighter.highlightElement(driver, textPass);
	  textPass.sendKeys("qweasd");
	
	  System.out.println("Adding - Credenciales");
	  
	  WebElement btnLoginUser = driver.findElement(By.xpath("//*[@id=\"checkout-step-login\"]/div/div[2]/div/button"));
	  Highlighter.highlightElement(driver, btnLoginUser);  
	  btnLoginUser.click();
	  System.out.println("Adding - LOGIN");
	  
	  WebElement btnBilling = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));
	  Highlighter.highlightElement(driver, btnBilling);
	  btnBilling.click();
	  System.out.println("Adding - btnBilling");
	  
	  //Billing Continnue
      //*[@id="billing-buttons-container"]/button
	  //click
	  WebElement btnContinueBilling = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));
	  Highlighter.highlightElement(driver, btnContinueBilling);
	  btnContinueBilling.click();
	  
	  System.out.println("Adding - btnContinueBilling");
	  
	  //Shipping Method
	  //*[@id="s_method_freeshipping_freeshipping"]
      //*[@id="shipping-method-buttons-container"]/button
	  //click
	  
	  WebElement shippingMethd = driver.findElement(By.xpath("//*[@id=\"s_method_freeshipping_freeshipping\"]"));
	  Highlighter.highlightElement(driver, shippingMethd);
	  shippingMethd.click();
	  System.out.println("Adding - shippingMethd");
	
	  WebElement shippingClick = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
	  Highlighter.highlightElement(driver, shippingClick);
	  shippingClick.click();
	  System.out.println("Adding - shippingClick");
	  
	  //Payment Method
      //*[@id="payment-buttons-container"]/button
	  
	  WebElement paymenthClick = driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button"));
	  Highlighter.highlightElement(driver, paymenthClick);
	  paymenthClick.click();
	  System.out.println("Adding - paymenthClick");
	  
	  //Place Order
      //*[@id="review-buttons-container"]/button
	  //click
	  WebElement placeOrderClic = driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button"));
	  Highlighter.highlightElement(driver, placeOrderClic);
	  placeOrderClic.click();
	  
	  System.out.println("Adding - placeOrderClic");
	  
	  
	  
  }
/*  
  @Test (priority = 2)
  public void AddShopingCart2() {
//	  System.out.println("Adding second product");
  }

  @Test (priority = 2)  
  public void LoginUser() {
	  
	  //login-email	renanc32@gmail.com
	  //login-password	qweasd
	  //*[@id="checkout-step-login"]/div/div[2]/div/button
	  System.out.println("Login user");
  }
*/  
  
  /*
  @Test (priority = 4)
  public void BillingMeth() {
	//*[@id="billing-buttons-container"]/button
	  System.out.println("billing meth");
  }
  
  @Test (priority = 5)
  public void ShippingMeth() {
	//Se activa el shipping method, dar clic free shipping y luego continue
	//*[@id="s_method_freeshipping_freeshipping"]
	//*[@id="shipping-method-buttons-container"]/button
	  System.out.println("shipping meth");
  }
  
  @Test (priority = 6)
  public void PaymentInfo() {
  // Se habilita el payment information
  //*[@id="payment-buttons-container"]/button
	  System.out.println("Payment Info");
  }
  
  @Test (priority = 7)
  public void PlaceOrder() {
	  
	//*[@id="review-buttons-container"]/button
	  
	//--Aqui terminamos con la orden y debo obtener el # de orden para validar
	//*[@id="top"]/body/div/div[2]/div[2]/div/div/p[1]
		  System.out.println("Place Order");
	  }
	  
*/  
  
  @BeforeMethod
  public void setup() {
	  
	  driver = WebDriverManager.chromedriver().create();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://demo-store.seleniumacademy.com/");
	  System.out.println("1 browser open");
  }
  
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
  
}
