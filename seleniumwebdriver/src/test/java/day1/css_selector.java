package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector 
{
	public static void mains(String[] args)
	{
		WebDriver driver=new ChromeDriver(); //ctrl+shift+o -->shortcut key
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id  tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tagname tag.classname
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		
		//tagname attribute
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T-shirts");
		
		//tagname.class[attribute='value']
		
		
		
		
	}

}
