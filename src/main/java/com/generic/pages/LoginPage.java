package com.generic.pages;

import static com.generic.pages.locators.LoginPageLocators.*;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.exceptions.WaitException;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) throws WaitException {
		super(driver);
		Assert.assertTrue(action
				.getVisibiltyOfElementLocatedBy(usernameLocator));
	}

	public LoginPage enterUsername(String username) throws TimeoutException,
			WaitException {
		action.enterText(VISIBILITY, usernameLocator, username);
		return this;
	}

	public LoginPage enterPassword(String password) throws TimeoutException,
			WaitException {
		action.enterText(VISIBILITY, passwordLocator, password);
		return this;
	}

	public LoginPage enterLoginDetails(String username, String password)
			throws TimeoutException, WaitException {
		enterUsername(username);
		enterPassword(password);
		return this;
	}

	public HomePage clickSubmit() throws TimeoutException, WaitException,
			InterruptedException {
		action.click(VISIBILITY, submitLocator);
		action.switchToSecondaryWindow("iReg | Dashboard");
		return new HomePage(driver);
	}
}
