package nswNewsWebsite;

import org.openqa.selenium.support.PageFactory;

import main.CucumberRunner;

//Base class which inherits Cucumber Test Runner class
public class BasePage extends CucumberRunner{
	
	public static <T extends BasePage> T initPage(Class<T> pageClass) {
		return PageFactory.initElements(driver, pageClass);
	}
}
