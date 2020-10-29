package com.pom.prac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class FramePage {

	WebDriver driver;

	public FramePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "draggable")
	WebElement source;
	
	@FindBy(id = "droppable")
	WebElement target;
	
	public void performDragAndDrop() {
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

	public String getValueAfterDropped() {
		driver.switchTo().frame(0);
		Utilities.waitForVisibilityOf(target);
		return target.getText();
	}
}
