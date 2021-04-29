package nswNewsWebsite;

import main.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Select Flight Page
public class nswWebsite_SelectTopics extends BasePage{
	

	@FindBy(xpath=Select_Topics)
	WebElement SelectTopic;
	
	public void Select_Topics_Page(final String firstname, final String lastname, final String cardnumber)
	{
		Utils.waitForElementToBePresent(driver, By.xpath("//input[@text='Select topics']"));//Wait for the Select Topic to load
		SelectTopic.click();
		
		
	}
	public static final String Select_Topics= "//input[@text='Select topics']";

}
