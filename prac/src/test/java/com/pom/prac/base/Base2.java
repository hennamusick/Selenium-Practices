package com.pom.prac.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base2 {

	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	static String[] urls = { "https://blazedemo.com", "https://www.spicejet.com", "https://www.spicejet.com",
			"https://rahulshettyacademy.com/dropdownsPractise", "https://rahulshettyacademy.com/AutomationPractice",
			"https://the-internet.herokuapp.com/dynamic_loading/1", "https://www.amazon.com",
			"https://support.google.com/accounts" };

	public static WebDriver setupDriver(int j) {
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		for (int i = 0; i < urls.length; i++) {
			if (i == j) {
				driver.get(urls[i]);
				break;
			}

		}
		return driver;
	}

}
