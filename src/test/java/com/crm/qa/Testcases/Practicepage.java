package com.crm.qa.Testcases;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Practicepage {
	public static WebDriver driver;
	
	@Before
	public void initialization() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		
	}
	
	@Test
	public void radioButton() {
	driver.get("https://learn.letskodeit.com/p/practice");
	WebElement bmw =driver.findElement(By.id("bmwradio"));
	bmw.isDisplayed();
	bmw.isEnabled();
	bmw.click();
	bmw.isSelected();
	}
	
	@Test
	public void Dropdown() {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement mySelectElement = driver.findElement(By.id("carselect"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText("Honda");
	}
	
	@Test
	public void MultipleSelect() {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement mySelectElements = driver.findElement(By.id("multiple-select-example"));
		Select dropdown= new Select(mySelectElements);
		dropdown.selectByVisibleText("Apple");
		dropdown.selectByVisibleText("Orange");
		dropdown.selectByVisibleText("Peach");
	}
	
	@Test
	public void checkBox() {
	driver.get("https://learn.letskodeit.com/p/practice");
	WebElement bmwcheck = driver.findElement(By.id("benzcheck"));
	bmwcheck.click();
	}
	
	@Test
	public void HandlingWindows() {
		driver.get("https://www.flipkart.com/");
		String handle= driver.getWindowHandle();
		driver.switchTo().window(handle);
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("8527463838");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Youcanwin1988");
		}
	
	@Test
	public void HandleTabs() {
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("opentab")).click();
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.partialLinkText("Selenium WebDriver With Java")).click();
				

	}
		
	}
	
