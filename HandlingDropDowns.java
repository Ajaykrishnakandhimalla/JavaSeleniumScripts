package com.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement drpdwn = driver.findElement(By.id("carselect"));
		
		Select drpdwnelements = new Select(drpdwn);
		
		List<WebElement> options = drpdwnelements.getOptions();
		
		for (WebElement items : options) {
			
			System.out.println(items.getText());
			
		}

	}

}
