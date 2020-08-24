package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DeviceDetailPage {

	WebDriver driver;

	public DeviceDetailPage(WebDriver jdriver) {

		this.driver = jdriver;
	}

	@FindBy(xpath = "//*[@type='radio' and @id='sku1010157']")
	WebElement silverRadioButton;

	@FindBy(xpath = "(//*[contains(text(),'Silver')])[2]")
	WebElement silverColorText;

	@FindBy(xpath = "(//*[contains(text(),'256 GB')])[1]")
	WebElement capacity_256GB;
	
	@FindBy(xpath = "(//*[contains(text(),'Full retail price')])[1]")
	WebElement full_Retail_Price;
	
	@FindBy(xpath = "(//*[contains(text(),'Continue ($1,249.99)')])[1]")
	WebElement continueCTA;
	
	
	String deviceDetailPageTitle;
	String deviceColor;
	
	
	public void verifyPageTitle() {
		//Assert.assertEquals(driver.getTitle(), deviceDetailPageTitle);
		System.out.println("DeviceDetailpage title Verified");
		System.out.println(driver.getTitle());
	}
	
	public void actionOnDeviceDetailPage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		silverRadioButton.click();
		Thread.sleep(3000);
		System.out.println("Verifying device Color");
		Assert.assertEquals(silverColorText.getText(), "Silver");
		capacity_256GB.click();
		full_Retail_Price.click();
		System.out.println("final price ==  "+continueCTA.getText());
		continueCTA.click();
	}
}