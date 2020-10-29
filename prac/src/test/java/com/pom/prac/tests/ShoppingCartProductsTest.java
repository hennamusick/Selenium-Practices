package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.ShoppingCartProductsPage;

public class ShoppingCartProductsTest {

	@Test
	public void testThatSelectingSingleProducts() {
		WebDriver driver = Base.setupDriverForShoppingCart();
		ShoppingCartProductsPage shoppingCartProductsPage = new ShoppingCartProductsPage(driver);
		shoppingCartProductsPage.gettingSingleProductToTheCart();

	}
	
	@Test
	public void testThatSelectingMultipleProducts() {
		WebDriver driver = Base.setupDriverForShoppingCart();
		ShoppingCartProductsPage shoppingCartProductsPage = new ShoppingCartProductsPage(driver);
		shoppingCartProductsPage.gettingMultipleProductsToTheCart();

	}
}
