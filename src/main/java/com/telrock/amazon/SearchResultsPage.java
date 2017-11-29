package com.telrock.amazon;

//import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
	
WebDriver driver;
	
/*	@FindAll(@FindBy(xpath="//*[@id=\"s-results-list-atf\"]"))
	List<WebElement> resultList; */
	
	@FindBy(xpath="//h2[@data-attribute='Blue Planet II']")
    WebElement itemTitle;

	public SearchResultsPage(WebDriver driver){
        this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() {

		// List<WebElement> ele = driver.findElements(By.linkText("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/ul/li[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(itemTitle));
		itemTitle.click();
			
	}

}
