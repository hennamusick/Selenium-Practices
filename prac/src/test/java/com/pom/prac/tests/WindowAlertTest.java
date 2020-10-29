package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.WindowAlertPage;

public class WindowAlertTest {

	@Test
	public void testTheAcceptingAlertWindow() {
		WebDriver driver = Base.setupDriverForWindowAlert();
		WindowAlertPage windowAlertPage = new WindowAlertPage(driver);
		windowAlertPage.clickConfirmButton();
		Assert.assertEquals(windowAlertPage.getTextAlertWindow(), "Hello , Are you sure you want to confirm?");
		windowAlertPage.acceptAlertWindow();
		Assert.assertFalse(WindowAlertPage.isAlertPresent());
	}
	
}
