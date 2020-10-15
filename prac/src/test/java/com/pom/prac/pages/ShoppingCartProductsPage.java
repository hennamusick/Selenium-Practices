package com.pom.prac.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class ShoppingCartProductsPage {

	WebDriver driver;

	public ShoppingCartProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "product-name")
	List<WebElement> products;

	@FindBy(xpath = "//div[@class = 'product-action']/button")
	List<WebElement> addToCartButtons;

	public void gettingMultipleProductsToTheCart() {

		String[] productItems = { "Cauliflower", "Cucumber", "Brocolli", "Beetroot" };

		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			String[] prodcutName = products.get(i).getText().split("-");
			String formattedProductName = prodcutName[0].trim();
			List<String> itemsNeeded = Arrays.asList(productItems);
			System.out.println(formattedProductName);

			if (itemsNeeded.contains(formattedProductName)) {

				j++;
				addToCartButtons.get(i).click();
				System.out.println("add to cart");

				if (j == 3) {
					break;
				}
			}

		}
	}

	public void gettingSingleProductToTheCart() {

		String[] productItems = { "Cucumber" };

		for (int i = 0; i < products.size(); i++) {
			String[] prodcutName = products.get(i).getText().split("-");
			String formattedProductName = prodcutName[0].trim();
			List<String> itemsNeeded = Arrays.asList(productItems);
			System.out.println(formattedProductName);

			if (itemsNeeded.contains(formattedProductName)) {
				addToCartButtons.get(i).click();
				System.out.println("add to cart");
				break;
			}

		}
	}

}
