package com.generic.pages;

import static com.generic.pages.locators.HomePageLocators.*;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.exceptions.WaitException;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) throws WaitException {
		super(driver);
		// Assert.assertTrue(action
		// .getVisibiltyOfElementLocatedBy(usernameLocator));
	}

	public HomePage hoverOver(String menuElement) throws TimeoutException,
			WaitException {
		action.hoverOverElement(VISIBILITY, menuLocator, menuElement);
		return this;
	}
}
