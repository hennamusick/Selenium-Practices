package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base2;
import com.pom.prac.pages.HandlingMultipleWindowsPage;

public class HandlingMultipleWindowsTest {

	@Test
	public void testHandlingMultipleWindow() throws InterruptedException {
		WebDriver driver = Base2.setupDriver(7);
		HandlingMultipleWindowsPage handlingMultipleWindowsPage = new HandlingMultipleWindowsPage(driver);
		handlingMultipleWindowsPage.clickAwesomeLinkText();
		handlingMultipleWindowsPage.choosingSelectedWindow();
	}
}
