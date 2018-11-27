package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{

	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Loginbtn;
	@FindBy(xpath = "//img[@alt='free crm logo']")
	WebElement crmLogo;

	public String validateLoginPageTitle() {
	return driver.getTitle();

	}

	public boolean validateCRMImage() {
	return crmLogo.isDisplayed();
	}

	public HomePage login(String un,String pwd) throws Exception {
	username.sendKeys(un);;
	password.sendKeys(pwd);
	Loginbtn.click();
	return new HomePage();

	}

	}