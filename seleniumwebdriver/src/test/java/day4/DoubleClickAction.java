package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickAction 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("httpss://www.w3schools.com/");
		driver.manage().window().maximize();
		

		//a[normalize-space()='Example code: Simple Context Menu']
		//a[@href='demo/on-dom-element.html']
		//a[@href='demo/dynamic.html']
		
		 
	}

}
