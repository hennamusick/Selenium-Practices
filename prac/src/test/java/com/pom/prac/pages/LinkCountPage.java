package com.pom.prac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
}
