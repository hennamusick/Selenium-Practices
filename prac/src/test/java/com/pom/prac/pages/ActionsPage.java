package com.pom.prac.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class ActionsPage {

	WebDriver driver;

	public ActionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#nav-link-accountList")
	WebElement accountList;

	@FindBy(id = "twotabsearchtextbox")
	WebElement mainSearchBar;

	public void mouseHoverActions() {
		Utilities.waitForVisibilityOf(accountList);
		Actions actions = new Actions(driver);
		actions.moveToElement(accountList).build().perform();
	}

	public void addCapitalLetterToSearchBar(String searchText) {
		Utilities.waitForVisibilityOf(mainSearchBar);
		Actions actions = new Actions(driver);
		actions.moveToElement(mainSearchBar).click().keyDown(Keys.SHIFT).sendKeys(searchText).doubleClick().build()
				.perform();
		mainSearchBar.sendKeys(Keys.CONTROL, "a");
		mainSearchBar.sendKeys(Keys.CONTROL, "c");
		mainSearchBar.clear();
		mainSearchBar.sendKeys(Keys.CONTROL, "v");
	}
}
