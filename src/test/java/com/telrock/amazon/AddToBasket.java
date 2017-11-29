package com.telrock.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AddToBasket {
	WebDriver driver;
	
	@BeforeSuite
	public void openUrl() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/BrowsersDrivers/geckodriver");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
	}
	@Test
	public void searchItemFromCatalog() {
		String book="Blue Planet";
		HomePage HP=new HomePage(driver);
		HP.searchItem(book);
		
	}
	@Test
	public void viewSearchResult() throws Throwable{
		SearchResultsPage SRP = new SearchResultsPage(driver);
		SRP.selectItem();
		//ProductDetailsPage PDP=new ProductDetailsPage(driver);
		//PDP.addToCart();
		//ConfirmationPage CP =new ConfirmationPage(driver);
		//String getMessage=
		//CP.confirmationMessage();
		//System.out.println(getMessage); 
	}
	
	@Test
	public void addToBasket() throws Throwable{
		ProductDetailsPage PDP=new ProductDetailsPage(driver);
		PDP.addToCart();
	}
	
	@Test
	public void confirmationText() throws Throwable{
		ConfirmationPage CP =new ConfirmationPage(driver);
			CP.confirmationMessage();
		//String getMessage=CP.confirmationMessage();
		//System.out.println(getMessage);
	} 
	
    @AfterSuite
	public void closeBrowser() {
    	//driver.close();
    }
	

}
