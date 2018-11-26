package com.crm.qa.Testcases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws Exception {
		super();
	}

	@Before
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
		System.out.println(title);
	}

	@Test
	public void crmLogoImageTest() {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test
	public void loginTest() throws Exception {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@After
	public void AfterMethod() {
		driver.close();
	}

}
