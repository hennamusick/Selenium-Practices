package com.pom.prac.tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		int j = 0;

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemNeededList = Arrays.asList(itemsNeeded);
			
			if(itemNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==3) {
					break;
				}
			}
					
		}
	}
}
