package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base2;
import com.pom.prac.pages.ActionsPage;

public class ActionsTest {

	@Test
	public void verifyMouseHover() {

		WebDriver driver = Base2.setupDriver(6);
		ActionsPage actionsPage = new ActionsPage(driver);
		actionsPage.mouseHoverActions();
		driver.quit();
	}
	
	@Test
	public void verifyCapitalLettersAsInputInSearchBar() {
		WebDriver driver = Base2.setupDriver(6);
		ActionsPage actionsPage = new ActionsPage(driver);
		String searchText = "new mobile";
		actionsPage.addCapitalLetterToSearchBar(searchText);
	}
}
