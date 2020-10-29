package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.prac.base.Base2;
import com.pom.prac.pages.FramePage;

public class FrameTest {

	@Test
	public void testThatDragAndDropIsWorking() {
		WebDriver driver = Base2.setupDriver(8);
		FramePage framePage = new FramePage(driver);
		framePage.performDragAndDrop();
		Assert.assertEquals(framePage.getValueAfterDropped(), "Dropped!");
	}
}
