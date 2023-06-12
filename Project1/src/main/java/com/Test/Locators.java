package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators extends ReusableMethods{
	 static WebDriver driver;

	    public  Locators (WebDriver driver)
	    {
	        this.driver=driver;
	    }

	static By firstname  =By.xpath("//input[@id='firstName']");
	static By lastname = By.xpath("//input[@id='lastName']");
	static By gender = By.xpath("//input[@id='femalerb']");
	static By languages = By.xpath("//input[@id='englishchbx']");
	static By email = By.xpath("//input[@id='email']");
	static By password = By.xpath("//input[@id='password']");
	static By register = By.xpath("//button[@id='registerbtn']");

	public static void basiDetaillForm() {
		
		
		
		driver.findElement(firstname).sendKeys("Thulasi");
		driver.findElement(lastname).sendKeys("Reddy");
	//	click(gender);
		//click(languages);
		driver.findElement(email).sendKeys("thulasi.c6@gmail.com");
		driver.findElement(password).sendKeys("sahithimini");
		//click(register);
		
		
		
	}









}
