package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	ChromeDriver driver;
	Properties pr;
	 
	public HomePage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		

	}
	
	public void clickTrending() throws InterruptedException
	{
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		Thread.sleep(3000);
	}
	public void historyclick() throws InterruptedException
	{
		
		WebElement history=driver.findElement(By.xpath("//a[@title='History'][1]"));
		history.click();
		Thread.sleep(3000);
	}
	public void subscriptionclick() throws InterruptedException
	{
		WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscriptions")));
		Subscriptions.click();
		Thread.sleep(3000);
		
	}
	public void watchlater() throws InterruptedException
	{
		
		WebElement watchlater=driver.findElement(By.xpath(pr.getProperty("watchlater")));
		watchlater.click();
		Thread.sleep(3000);
	}
	public void library() throws InterruptedException
	{
		
		
		WebElement Library=driver.findElement(By.xpath(pr.getProperty("Library")));
		Library.click();
		Thread.sleep(3000);
		
	}
	
}
