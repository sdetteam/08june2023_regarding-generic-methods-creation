package com.Test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the driver name");
		String s = sc.next();
		ReusableMethods methods = new ReusableMethods();
		methods.launchBrowser(s);
		methods.expectedUrl("https://www.hyrtutorials.com/p/basic-controls.html");
		//methods.clickElement(By.id("firstName"));
		methods.enterText(By.id("firstName"), "Thulasi");
	}
// WebDriver driver;

		   // public Test1(WebDriver driver) {
		       // this.driver = driver
		    
	
		
}
		    
