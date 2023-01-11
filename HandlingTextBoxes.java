package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTextBoxes {

	/** 
	 * 
	 * @throws Exception 
	 * @Author Ajay krishna K
	 * How to handle TextBoxes using Selenium WebDriver
	 */

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");

		WebElement userText = driver.findElement(By.id("login_field"));
		if (userText.isDisplayed()) {

			if (userText.isEnabled()) {
				userText.sendKeys("ajaykrishna@gmail.com");	
				String EnteredText = userText.getAttribute("value");
				System.out.println(EnteredText);
				Thread.sleep(3000);
				userText.clear();

			}
			else {
				System.err.println("UserName TextBox is NotEnabled");
			}
		}
		else {
			System.err.println("UserName TextBox is NotDisplayed");
		}

	}

}
