package com.pom.prac.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.xml.dom.ParentSetter;

import com.pom.prac.base.Utilities;

public class HandlingMultipleWindowsPage {

	WebDriver driver;

	public HandlingMultipleWindowsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='product-icon']")
	WebElement productIcon;

	public void clickAwesomeLinkText() {
		Utilities.waitForVisibilityOf(productIcon);
		productIcon.click();
	}

	public void choosingSelectedWindow() {
		Set<String> windowsList = driver.getWindowHandles();
		Iterator<String> iterator = windowsList.iterator();
		String parerntWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(parerntWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}
}
