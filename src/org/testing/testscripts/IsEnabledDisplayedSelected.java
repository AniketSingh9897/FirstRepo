package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsEnabledDisplayedSelected {
public static ChromeDriver driver;
public static void main(String[] args)

{
System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
ChromeOptions op=new ChromeOptions();
op.setBinary("C:\\Users\\aniket.singh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
 driver=new ChromeDriver(op);
driver.get("https://api.cogmento.com/register/?lang=en-GB");
driver.manage().window().maximize();
Boolean bj=driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
System.out.println(bj);

driver.findElement(By.xpath("//input[@name='terms']")).click();
boolean tr=driver.findElement(By.xpath("//input[@name='terms']")).isSelected();

System.out.println(tr);

}



}
