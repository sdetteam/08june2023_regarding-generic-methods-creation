package com.Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {
	static ReadDataFromJSONFile inputfromJson = new ReadDataFromJSONFile(); 
	public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver","C:\\Users\\kalwakolu.thulasi\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(inputfromJson.getValueByKey("username"));
		
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(inputfromJson.getValueByKey("password"));

driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
