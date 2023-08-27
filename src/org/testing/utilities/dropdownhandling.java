package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling {

	public static void dropdownselectionusingIndex(int index,WebElement dropdown)
	
	{
		Select s=new Select(dropdown);
		s.selectByIndex(index);	
	}
	public static void dropdownselectionusingValue(String month,WebElement dropdown2)
	{
		Select s2=new Select(dropdown2);
		s2.selectByValue(month);
	}
	public static void dropdownselectionusingVisibleText(String text,WebElement dropdown3)
	{
		Select s3=new Select(dropdown3);
		s3.selectByVisibleText(text);
	}
	
	
}
