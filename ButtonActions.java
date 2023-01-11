package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonActions {
	
	/**
	 *  
	 * @Author Ajay Krishna K
	 * Handling Buttons, Radio Buttons, Check Boxes, Links
	 */

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(3000);
		
		//Handling the Radio Button

		WebElement rdbtn = driver.findElement(By.id("bmwradio"));
		if (rdbtn.isSelected()) {
			rdbtn.click(); //UnChecking the RadioButton
		}
		else {
			rdbtn.click();
		}

	}

}
