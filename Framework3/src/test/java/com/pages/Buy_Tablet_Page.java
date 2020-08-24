package com.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Buy_Tablet_Page {

	
WebDriver driver;
	
	public Buy_Tablet_Page(WebDriver kdriver)
	{
		this.driver = kdriver;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Sorting')]")
	WebElement sorting;
	
	@FindBy(xpath = "(//*[contains(text(),'Price: low to high')])[2]")
	WebElement lowToHighSort;
	
	@FindBy(xpath = "(//*[contains(text(),'Best-selling')])[1]")
	WebElement bestSelling;
	
	@FindBy(xpath = "//*[contains(text(),'Add sorting')]")
	WebElement addSorting;
	
	@FindBy(xpath = "(//*[contains(text(),'Galaxy Tab A 8.4')])[1]")
	WebElement galaxyTab_8;
	
	@FindBy(xpath = "(//*[contains(text(),'iPad Pro 12.9-inch 4th generation')])[1]")
	WebElement iPadPro;
	
	String tabletPageTitle = "Tablets from AT&T";
	public void verifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), tabletPageTitle);
		  System.out.println("TabletPage Title verified");
		  
	}
	
	public void actionOnTabletPage() throws InterruptedException
	{
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sorting.click();
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(4000);
		System.out.println("sorting clicked");
		addSorting.click();
		Thread.sleep(4000);
		iPadPro.click();
		
		
	}
	
}



/* String parent=driver.getWindowHandle();
 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); Set<String>
 * s1=driver.getWindowHandles(); Iterator<String> i1 = s1.iterator();
 * while(i1.hasNext()) { String child = i1.next(); if(!parent.equals(child)) {
 * driver.switchTo().window(child);
 * System.out.println("Waiting for radio Buttons to get load");
 * bestSelling.click();
 * System.out.println("Best Selling radio Buttonget selected");
 * addSorting.click(); } }
 * 
 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 * driver.switchTo().window(parent);
 * 
 */