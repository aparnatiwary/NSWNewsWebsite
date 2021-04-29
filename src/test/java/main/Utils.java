package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	static final int WAIT_TIME=50;
	
	public static WebElement waitForElementToBePresent(final WebDriver driver, final By by){
		WebDriverWait wait = new WebDriverWait(driver, Utils.WAIT_TIME);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return driver.findElement(by);
	}

}
