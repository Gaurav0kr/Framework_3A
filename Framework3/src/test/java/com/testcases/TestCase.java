package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pages.Att_HomePage;
import com.pages.Buy_Phone_Page;
import com.pages.Buy_Tablet_Page;
import com.pages.DeviceDetailPage;
import com.utility.BrowserFactory;

public class TestCase {
	WebDriver driver;
	Att_HomePage homePage1;
	Buy_Phone_Page buyPhonePage;
	Buy_Tablet_Page buyTabletPage;
	DeviceDetailPage deviceDetailPage;

	@BeforeTest
	public void setup() {
		driver = BrowserFactory.startApp(driver, "chrome", "https://www.att.com/");

	}

	@AfterTest
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

	@Test
	public void nc_Buy_tablet() throws InterruptedException {

		homePage1 = PageFactory.initElements(driver, Att_HomePage.class);
		buyPhonePage = PageFactory.initElements(driver, Buy_Phone_Page.class);
		buyTabletPage = PageFactory.initElements(driver, Buy_Tablet_Page.class);
		deviceDetailPage = PageFactory.initElements(driver, DeviceDetailPage.class);

		homePage1.verifyWebElementAtHomePage();
		homePage1.actionOnHomePage();
		
		buyPhonePage.verifyPageTitle();
		buyPhonePage.click_on_tablet();
		
		buyTabletPage.verifyPageTitle();
		
		buyTabletPage.actionOnTabletPage();
		
		deviceDetailPage.verifyPageTitle();
		try
		{
		deviceDetailPage.actionOnDeviceDetailPage();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
