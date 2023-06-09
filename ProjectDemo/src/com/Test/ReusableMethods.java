package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableMethods {
	static WebDriver driver;
	public void launchBrowser(String browserType) {
		 if(browserType.equalsIgnoreCase("chrome")){
			 System.setProperty("Webdriver.chrome.driver","C:\\Users\\kalwakolu.thulasi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 else if(browserType.equalsIgnoreCase("firefox")) {
			 System.setProperty("","");
			 driver = new FirefoxDriver();
		 }
		 else if(browserType.equalsIgnoreCase("ie")) {
			 System.setProperty("","");
			 driver = new InternetExplorerDriver();
		 }
	}
		 
	
public void expectedUrl (String url) {
	driver.get(url);
	
}
public void clickElement(By Xpath) {
    driver.findElement(Xpath).click();
}

public void enterText(By Xpath, String text) {
    driver.findElement(Xpath).sendKeys(text);
}

}