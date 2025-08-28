package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 * Test Cases
 * 1)launch browser(chrome)
 * 2)open URL https://demo.opencart.com/
 * 3)validate title should be "your store"
 * close browser
 */

public class FirstTestCase 
{
	public static void main(String[] args)
	{
		//launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2)open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3)validate title should be "your store"
		String act_title=driver.getTitle();
		if(act_title.equals("your store"))
		{
			System.out.println("test is passed");
			
		}
		else
		{
			
			System.out.println("test is failed");
		}
		
		//4)close browser
		driver.close();
		//driver.quit();
		
	}

}
