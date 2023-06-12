package reusablecode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonmethods {


private WebDriver driver;


// for click Action
public void clickingOnWebElemet(WebElement element , long waitTimeInSeconds ) {
  WebDriverWait webwait = new WebDriverWait(driver,Duration.ofSeconds(waitTimeInSeconds));
  WebElement elements = null;
  elements = webwait.until(ExpectedConditions.elementToBeClickable(element));
  elements.click();
}

//for send keys Action on the text field

public void sendkeysOnWebElement(WebElement element,String text) {
	element.click();
	element.clear();
	element.sendKeys(text);
}


// Method for selecting drop down list
 public void selectByVisibleText(WebElement element,String text) {
	 Select select = new Select(element);
	 
	 select.selectByVisibleText(text);
 }
 
 
 // accepting an alert from UI
 
 public void acceptAlert(WebDriver driver) {
	 driver.switchTo().alert().accept();
	 
 }
 

//this method is for mouse hovering from one element to other element

public void mouseHoverAndClickElement(WebElement element) {
	
	Actions action = new Actions(driver);
	action.moveToElement(element).click().build().perform();
	
	
	
}


//for drag and drop

public void moveToElement(WebElement element) {
    Actions actions = new Actions(driver);
    actions.moveToElement(element).perform();
}


//for double click
public void moveToElementAndDoubleClick(WebElement element) {
    Actions actions = new Actions(driver);
    actions.moveToElement(element).doubleClick().perform();
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

//for drop down

public void selectDropdownOptionByIndex(By locator, int optionIndex) {
    WebElement dropdownElement = driver.findElement(locator);
    Select dropdown = new Select(dropdownElement);
    dropdown.selectByIndex(optionIndex);
}



//for drop down
public String getSelectedDropdownOption(By locator) {
    WebElement dropdownElement = driver.findElement(locator);
    Select dropdown = new Select(dropdownElement);
    WebElement selectedOption = dropdown.getFirstSelectedOption();
    return selectedOption.getText();
}


public void selectDropdownOptionByValue(By locator, String optionValue) {
    WebElement dropdownElement = driver.findElement(locator);
    Select dropdown = new Select(dropdownElement);
    dropdown.selectByValue(optionValue);
}
}