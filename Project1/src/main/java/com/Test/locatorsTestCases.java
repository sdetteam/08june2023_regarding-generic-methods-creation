package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class locatorsTestCases extends ReusableMethods{
	 public WebDriver driver;
Locators locators = new Locators(driver);
	@Test
	public void registrationForm() {
		locators.basiDetaillForm();
		
		
		
	}
	
	
}
