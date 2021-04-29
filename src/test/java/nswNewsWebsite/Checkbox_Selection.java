	package nswNewsWebsite;

import java.util.List;

import main.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Checkbox Selection Page
public class Checkbox_Selection extends BasePage{
	
	@FindBy(xpath=ALL_CheckBOX)
	List<WebElement> ALLCheckBOxes;//To store all checkboxes in a list
	@FindBy(xpath=ArtsnCulture)
	WebElement ArtsNCulture;
	@FindBy(xpath=Awardss)
	WebElement Awards;
	@FindBy(xpath=BusEconomy)
	WebElement BsuinessnEconomy;
	@FindBy(xpath=Cabi)
	WebElement Cabinet;
	@FindBy(xpath=Edu)
	WebElement Education;
	@FindBy(xpath=Emergency)
	WebElement EmergencyServices;
	
	
	public void rearrange_checkBoxes(){
		
		// code for selection of check boxes and storing them in list goes here
	}
	
	public void Passenger_Travel_Itinerary(final String departFrom, final String arriveto)
	{
		Utils.waitForElementToBePresent(driver, By.xpath("//input[@name='findFlights']"));//Wait for the Continue button to load
		rearrange_checkBoxes();
		//code for selection of check box values goes here - switch case for each value entered by the user
	}
	
	//Please note below rare indicative xpaths that might not be correct 
	public static final String ALL_CheckBOX = "//input[@type='checkbox']"; 
	public static final String ArtsnCulture= "//input[@text='Arts & Culture']";
	public static final String Awardss= "//input[@text='Awards']";
	public static final String BusEconomy= "//input[@text='BusinessEconomy']";
	public static final String Cabi= "//input[@text='Cabinet']";
	public static final String Edu= "//input[@text='Education']";
	public static final String Emergency= "//input[@text='EmergencyServices']";
	

}
