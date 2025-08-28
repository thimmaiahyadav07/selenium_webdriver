package day4;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions 
{
	public static void mains(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement software=(WebElement) driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
		
		Actions act=new Actions(driver);
		//mouse hover actions
		//act.moveToElement(computer).moveToElement(software).click().build().perform();
		act.moveToElement(computer).moveToElement(software).perform();
		
		
		
		
	}

}
