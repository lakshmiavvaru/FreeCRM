package com.crm.qa.Testcases;

import org.junit.Before;
import org.junit.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{

	HomePage homePage;
	
	public HomePageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before
	public void setUp() throws Exception {
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void verifyHomePageTitle() throws InterruptedException {
		Thread.sleep(10000);
		String title = homePage.validateHomePageTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
		
		
	}

}
