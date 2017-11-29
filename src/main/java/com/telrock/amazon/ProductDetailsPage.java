package com.telrock.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {
	
	//@FindBy(xpath="//div[@class='a-button-stack']/span[@id='submit.add-to-cart']/span/input[@id='add-to-cart-button']")
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement addToBasket;
		// "//*[@id='add-to-cart-button']"
	
	WebDriver driver;
		
		public ProductDetailsPage(WebDriver driver){
	        this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		public void addToCart(){
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(addToBasket));
			addToBasket.click();
		}


}
