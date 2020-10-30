package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base2;
import com.pom.prac.pages.LinkCountPage;

public class LinkCountTest {

	@Test
	public void testAllLinksCountOfEntirePage() {
		WebDriver driver = Base2.setupDriver(4);
		LinkCountPage linkCountPage = new LinkCountPage(driver);
		linkCountPage.gettingAllLinksCountOfEntirePage();
		driver.quit();
	}

	@Test
	public void testAllLinksCountOfSubSet() {
		WebDriver driver = Base2.setupDriver(4);
		LinkCountPage linkCountPage = new LinkCountPage(driver);
		linkCountPage.gettingAllLinksCountOfSubSet();
		driver.quit();
	}

	@Test
	public void testAllLinksCountOfSubSetWithNewTabs() {
		WebDriver driver = Base2.setupDriver(4);
		LinkCountPage linkCountPage = new LinkCountPage(driver);
		linkCountPage.gettingAllLinksCountOfSubSetBySeperateTabs();
		driver.quit();
	}
}
