package com.pom.prac.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.pom.prac.base.Base;
import com.pom.prac.base.Base2;
import com.pom.prac.pages.DropDownPage;

@Test
public class DropDownTest {

	//WebDriver driver = Base.setupDriverForDropDowns();
	//DropDownPage dropDownPage = new DropDownPage(driver);
	//Base base = new Base();

	/*
	 * @BeforeTest public void beforeTest() { Base.getDriver(); }
	 */

	/*
	 * @AfterMethod public void driverQuitMethod() { WebDriver driver =
	 * Base.setupDriverForDropDowns(); DropDownPage dropDownPage = new
	 * DropDownPage(driver); dropDownPage.closeDriver(); }
	 */

	@Test
	public void atestadeals() {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.clickDeals();
		driver.quit();
	}

	@Test
	public void testThatTheALandingPageIsNavigatingCorrectly() {
		
		int j = 3; WebDriver driver = Base2.setupDriver(j);
		 
		//WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.selectCurrency();
		Assert.assertEquals(dropDownPage.getSelectedCurrencyValue(), "AED");
		driver.quit();
	}

	@Test
	public void testThatTheFromAndToIsSelectingCorrectly() throws InterruptedException {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.clickFromDropDown();
		dropDownPage.selectBengaluru();

		dropDownPage.clickToDropDown();
		dropDownPage.selectChennai();
		Assert.assertEquals(dropDownPage.getSelectedChennai(), "Chennai (MAA)");
		Assert.assertEquals(dropDownPage.getSelectedBengaluru(), "BLR");
		driver.quit();
	}

}
