package stepDefination;

import java.io.IOException;
import java.util.List;

import testData.DataUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import nswNewsWebsite.BasePage;
import nswNewsWebsite.Checkbox_Selection;
import nswNewsWebsite.NSWwebsite_LoginPage;



public class steps extends CucumberRunner{
	
	NSWwebsite_LoginPage FlogIn;
	Checkbox_Selection FPassItinerary;
	
	
	private static Boolean runOnce = false;
	
	@Before
	public void beforeAll() throws Exception{
		if (!steps.runOnce){
			CucumberRunner.config = CucumberRunner.readProperties();
			SetUp();
		}
		
	}
	
	@Before
	public void before(final Scenario scenario) throws Exception{
		CucumberRunner.scenario =scenario;
	}
	
	@After
	public void after(final Scenario scenario) throws IOException{
		CucumberRunner.driver.quit();	
	}
	
	@Given("^user is on NSW Website$")
	public void user_is_on_NSW_Website(){
		CucumberRunner.driver.get(CucumberRunner.config.get("NSWwebsite"));
	}
	
	@Then("^verify if user is able to select the desired option$")
	public void verify_if_user_is_able_to_select_the_desired_option(final List<DataUtils> testData) throws Throwable {
		DataUtils data = testData.get(0);
		//code to call the base class and to call the input selected by the user goes here
	  
	}
	
}
