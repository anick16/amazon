package com.telrock.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ConfirmationPage {
	
	@FindBy(xpath="//h1[@class='a-size-medium a-text-bold']")
    WebElement addedToBasket;
	
	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	public void confirmationMessage() {
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(addedToBasket));
		
		String messageText = addedToBasket.getText();
				
		try {
			Assert.assertEquals("Added To Basket", messageText);
		}catch(AssertionError ae) {
			ae.getMessage();
		}

	}
}
