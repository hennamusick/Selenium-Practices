package com.pom.prac.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class WindowAlertPage {

	static WebDriver driver;

	public WindowAlertPage(WebDriver driver) {
		WindowAlertPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "confirmbtn")
	WebElement confirmButton;
	
	public void clickConfirmButton() {
		Utilities.waitForClick(confirmButton);
		confirmButton.click();
	}
	
	public void acceptAlertWindow() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlertWindow() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextAlertWindow() {
		return driver.switchTo().alert().getText();
	}
	
	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException ex) {
			return false;
		}
	}
}
