package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBox {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(3000);
		WebElement chkbx = driver.findElement(By.id("bmwcheck"));
		
		if(chkbx.isSelected()) {
			chkbx.click(); //Unselecting
		}
       
		else {
			chkbx.clear(); //Selecting
		}
	}

}
