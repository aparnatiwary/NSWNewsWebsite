package nswNewsWebsite;

import main.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//NSW Website Login Page 
public class NSWwebsite_LoginPage extends BasePage{
	
	
	public void logIn(final String username, final String password)
	{
		
		Utils.waitForElementToBePresent(driver, By.xpath("//input[@name='userName']"));//Wait for the Username field to load
		String pageTitle = driver.getTitle(); 
		Assert.assertEquals(pageTitle, "NSW Government");//to verify if the NSWPage is opened,if not the program will stop ::this might change once i am able to run the code
		
				
	}
	

	
	

}
