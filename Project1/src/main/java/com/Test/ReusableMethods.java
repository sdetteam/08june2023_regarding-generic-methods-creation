package com.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {
	public static WebDriver driver;
	
	 public void navigateTo(String url) {
	        driver.get(url);
	    }

	    public WebElement findElement(By locator) {
	        return driver.findElement(locator);
	    }

	    public void clickElement(By locator) {
	        findElement(locator).click();
	    }

	    public void enterText(By locator, String text) {
	        findElement(locator).sendKeys(text);
	    }
//for waiting elements
	    public void waitForElement(WebDriver driver, By locator, Duration timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, timeout);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	    public void takeScreenshot(String fileName) {
	        // Capture screenshot as File
	        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        // Specify the destination location
	        String destinationPath = "path/to/save/screenshots/" + fileName + ".png";

	        try {
	            // Save the screenshot to the specified location
	            FileUtils.copyFile(screenshotFile, new File(destinationPath));
	            System.out.println("Screenshot captured: " + destinationPath);
	        } catch (IOException e) {
	            System.out.println("Failed to capture screenshot: " + e.getMessage());
	        }
	    }
	        public void moveToElementAndClick(By locator) {
	            WebElement element = driver.findElement(locator);
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element).click().perform();
	        
	        
	    }
	        //for drag and drop
	        public void moveToElement(WebElement element) {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element).perform();
	        }
	        public void moveAndClickOnLocation(int x, int y) {
	            Actions actions = new Actions(driver);
	            actions.moveByOffset(x, y).click().perform();
	        }  
	        
	        //for click and hold
	        public void clickAndHoldElement(WebElement element) {
	            Actions actions = new Actions(driver);
	            actions.clickAndHold(element).build().perform();
}
	        //for double click
	        public void moveToElementAndDoubleClick(WebElement element) {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element).doubleClick().perform();
	        }
	        //for drag and drop
	        public void dragAndDrop(WebElement source, WebElement target) {
	       	 WebElement source1 = driver.findElement(By.id("sourceElement"));
	            WebElement target1 = driver.findElement(By.id("targetElement"));
	           Actions actions = new Actions(driver);
	           actions.dragAndDrop(source1, target1).perform();
	   }   
	    //drag and drop by location    
	        public void dragAndDropByLocation(WebElement element, int xOffset, int yOffset) {
	      	  WebElement element1 = driver.findElement(By.id("exampleElement"));

	            int xOffset1 = 100; // x-coordinate offset
	            int yOffset1 = 200; // y-coordinate offset
	          Actions actions = new Actions(driver);
	          actions.dragAndDropBy(element1, xOffset1, yOffset1).release().build().perform();
	      }  
	        //wait until the element is clickable
	        public void waitUntilClickable(WebElement element, Duration timeoutInSeconds) {
	            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	        }
	        //wait until the element is visible
	        public void waitUntilVisibleElement(WebElement element, Duration timeoutInSeconds) {
	            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	            wait.until(ExpectedConditions.visibilityOf(element));
	        }
	        //
	        public void waitElementToBeSelected(By locator, Duration timeoutInSeconds) {
	            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	            wait.until(ExpectedConditions.elementToBeSelected(locator));
	        }
	        public void waitListOfAllElementsVisible(By locator, Duration timeoutInSeconds) {
	            List<WebElement> elements = driver.findElements(locator);
	              WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	              wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	          }
	        public boolean isListOfElementsDisplayedOnScreen(List<WebElement> elements) {
	        	List<WebElement> elements1 = driver.findElements(By.tagName("a"));
	            for (WebElement element : elements1) {
	                if (!element.isDisplayed()) {
	                    return false;
	                }
	            }
	            return true;
	        }
	        public void selectDropdownOptionByValue(By locator, String optionValue) {
	            WebElement dropdownElement = driver.findElement(locator);
	            Select dropdown = new Select(dropdownElement);
	            dropdown.selectByValue(optionValue);
	        }
	        public void selectDropdownOptionByText(By locator, String optionText) {
	            WebElement dropdownElement = driver.findElement(locator);
	            Select dropdown = new Select(dropdownElement);
	            dropdown.selectByVisibleText(optionText);
	        }
	        public void selectDropdownOptionByIndex(By locator, int optionIndex) {
	            WebElement dropdownElement = driver.findElement(locator);
	            Select dropdown = new Select(dropdownElement);
	            dropdown.selectByIndex(optionIndex);
	        }
	        public String getSelectedDropdownOption(By locator) {
	            WebElement dropdownElement = driver.findElement(locator);
	            Select dropdown = new Select(dropdownElement);
	            WebElement selectedOption = dropdown.getFirstSelectedOption();
	            return selectedOption.getText();
	        }
	        
	        
	        
	        
}
