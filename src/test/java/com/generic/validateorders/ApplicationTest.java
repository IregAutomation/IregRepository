package com.generic.validateorders;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.exceptions.WaitException;
import com.generic.pages.HomePage;
import com.generic.pages.LoginPage;
import com.generic.testbase.TestBase;

public class ApplicationTest extends TestBase {

	private LoginPage loginPage;
	private HomePage homePage;

	@BeforeClass
	public void beforeClass(ITestContext context) throws WaitException {
		loginPage = new LoginPage(getWebDriverInstance(context));
	}

	@Test
	public void enterLoginData() throws Exception {
		loginPage.enterLoginDetails("admin","admin123");
		homePage = loginPage.clickSubmit();
		homePage.hoverOver("Administration");
		Thread.sleep(9000);
	}
}
