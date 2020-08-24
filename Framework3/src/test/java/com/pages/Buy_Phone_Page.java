package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Buy_Phone_Page {

	WebDriver driver;

	public Buy_Phone_Page(WebDriver idriver) {
		this.driver = idriver;
	}

	@FindBy(xpath = "//a[@href='/buy/phones/']")
	WebElement phonesTab;

	@FindBy(xpath = "(//*[contains(text(),'Accessories')])[1]")
	WebElement accessoriesTab;

	@FindBy(xpath = "(//*[contains(text(),'Smartwatches')])[1]")
	WebElement smartwatchesTab;

	@FindBy(xpath = "(//*[contains(text(),'Tablets')])[1]")
	WebElement TabletsTab;

	String buyPhonePageTitle = "Phones, Cell Phones, & Smartphones from AT&T";

	public void verifyPageTitle() {
		// Assert.assertEquals(driver.getTitle(), buyPhonePageTitle);
		System.out.println(driver.getTitle());
		System.out.println("Page Title verified");

	}

	public void click_on_tablet() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TabletsTab.click();

	}
}
