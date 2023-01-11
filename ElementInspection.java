package com.SeleniumPractise;

import org.apache.tomcat.jni.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementInspection  {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		ElementInspection i = new ElementInspection();


		driver.findElement(By.name("login"));



	}

}
