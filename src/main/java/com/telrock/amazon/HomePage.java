package com.telrock.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	//@FindBy (xpath="")
	//WebElement catalog;
	

	@FindBy(how=How.ID, using = "searchDropdownBox")
	public WebElement catalogList;
	
	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public WebElement searchBox;
		
	WebDriver driver;
	
	public HomePage(WebDriver driver){
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String book){
		Select dropdown = new Select(catalogList);
		dropdown.selectByVisibleText("Books");
		searchBox.sendKeys(book);
		searchBox.submit();
	}
}
