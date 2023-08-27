package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlayPage {
	ChromeDriver driver;
	Properties pr;
	 
	public VideoPlayPage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		

	}
public void videoplay() throws InterruptedException
{

	WebElement video=driver.findElement(By.xpath(pr.getProperty("video")));
	video.click();
	Thread.sleep(3000);

}
	public void likevideo() throws InterruptedException
{
	
	WebElement like=driver.findElement(By.xpath(pr.getProperty("like")));
	like.click();
	Thread.sleep(3000);
	

}
	public void subscribebutton() throws InterruptedException
	{WebElement subscribebutton=driver.findElement(By.xpath(pr.getProperty("subscribebutton")));
	subscribebutton.click();
	Thread.sleep(3000);
	}
	public void commentadd(String Commenttext) throws InterruptedException
	
	{
		JavascriptExecutor js=(JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,350)","");

		Thread.sleep(3000);

		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.click();
		Thread.sleep(3000);
		WebElement commenting=driver.findElement(By.xpath(pr.getProperty("commenting")));
		commenting.sendKeys(Commenttext);
		Thread.sleep(3000);
		WebElement commentbutton=driver.findElement(By.xpath("//button[@aria-label='Comment']"));
		commentbutton.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
}
