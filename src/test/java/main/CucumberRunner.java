package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
//import java.util.GregorianCalender;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict= true, monochrome =true, features= "src/main/java/feature", glue= "stepDefination",
		tags= {"@Regression"})

public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	public static Map<String, String> config;
	public static Scenario scenario;
	public static WebDriver driver=null;
	
	public static FileInputStream readFile(final String file) throws FileNotFoundException{
		return new FileInputStream(new File(file));
	}
	public static Map<String, String> readProperties() throws FileNotFoundException, IOException {	
		Properties prop = new Properties();
		prop.load(readFile(System.getProperty("user.dir") + "/src//main//java//config//config.properties"));
		Map<String, String> properties = new HashMap<String, String>();
		Enumeration<Object> KeyValues = prop.keys();
		while(KeyValues.hasMoreElements()){
			String key =(String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			properties.put(key, System.getProperty(key, value));
		}
		return properties;
	}
	
		public static void getCurrentDriver()
		{
			String browser = CucumberRunner.config.get("browser");
			switch (browser)
			{
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+ "//src//main//java//drivers/chromedriver.exe");
				CucumberRunner.driver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty("user.dir")+ "//src//main//java//drivers/geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				CucumberRunner.driver = new FirefoxDriver(capabilities);
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", 
						System.getProperty("user.dir")+ "//src//main//java//drivers/IEdriver.exe");
				CucumberRunner.driver = new InternetExplorerDriver();
				break;
			default:
				throw new WebDriverException("No browser has been specified");
			}
		}
		
		public void maximizeWindow(){
			CucumberRunner.driver.manage().window().maximize();
		}
		
		public void deleteAllCookies(){
			CucumberRunner.driver.manage().deleteAllCookies();
		}
		
		public void SetUp() throws Exception{
			getCurrentDriver();
			maximizeWindow();
			deleteAllCookies();
		}

}
