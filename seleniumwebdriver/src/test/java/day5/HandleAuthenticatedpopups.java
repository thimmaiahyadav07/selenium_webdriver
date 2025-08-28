package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedpopups
{
	public static void mains(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//Syntax
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}
	


}

