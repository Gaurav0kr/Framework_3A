package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Att_HomePage {
//
	//
			
	 WebDriver driver;
	
	public  Att_HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
		
		@FindBy(xpath = "//a[@href='https://www.att.com/deals/']") 
		public WebElement header1deals;
		@FindBy(xpath ="//a[@href='/deals/']") 
		public WebElement header2deals;
		@FindBy(xpath = "//a[@href='/buy/phones/']") 
		public WebElement phones_devices;
		@FindBy(xpath = "//span[@class='ge5p_hamburger_icon']") 
		public WebElement menu;
		@FindBy(xpath = "//*[@class='auth-pull-left' and text()='Wireless']") 
		public WebElement wirelessLink;
		@FindBy(xpath = "//*[@class='auth-pull-left' and text()='Phones & devices']") 
		public WebElement phone_Devices;
		
		String homepageTitle = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";
		
		
		public void verifyWebElementAtHomePage()
		
		{ 
			Assert.assertEquals(true, header1deals.isDisplayed());
			Assert.assertEquals(true, header2deals.isDisplayed());
			System.out.println("Element Verified");
		}
		  public void verifyPageTitle()
		  {
			  Assert.assertEquals(driver.getTitle(), homepageTitle);
			  System.out.println("Page Title verified"); 
		  }
		public void actionOnHomePage() {
			
			
			System.out.println("Action started on Home Page");
			 menu.click();
			
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 wirelessLink.click(); 
			 phone_Devices.click();
			 System.out.println("Action Closed on Home Page");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			
		}
}
