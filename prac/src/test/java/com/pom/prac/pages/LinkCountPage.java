package com.pom.prac.pages;

import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle.Control;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class LinkCountPage {

	WebDriver driver;

	public LinkCountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "a")
	List<WebElement> allLinks;

	@FindBy(id = "gf-BIG")
	WebElement footerDriver;

	@FindBy(css = "div[id='gf-BIG'] a")
	List<WebElement> allLinksOfFooterDriver;

	public void gettingAllLinksCountOfEntirePage() {
		System.out.println(allLinks.size());
	}

	public void gettingAllLinksCountOfSubSet() {
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		System.out.println(allLinksOfFooterDriver.size());
	}

	public void gettingAllLinksCountOfSubSetBySeperateTabs() {
		for (int i = 0; i < allLinksOfFooterDriver.size(); i++) {
			String clickLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			allLinksOfFooterDriver.get(i).sendKeys(clickLinkTab);
		}

		Set<String> windowList = driver.getWindowHandles();
		Iterator<String> iterator = windowList.iterator();

		while (iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
		}

	}
}
