package org.testing.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googletable {
	public static ChromeDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Users\\aniket.singh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(op);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
			
			driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Java");
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']"));
			
			System.out.println("total number of suggestions in search box:::===>" + list.size());
			
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("javascript")){
					list.get(i).click();
					break;
				}
				
			}
			
			
			
		}

}