package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	

	public static <WebDriver> void main(String[] args)
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		
		Actions act=new Actions(driver);
		
		WebElement img1=driver.findElement(By.xpath("//img[@id='img1']"));
		WebElement img2=driver.findElement(By.xpath("//div[@id='div2']"));
		//drag and drop
		act.dragAndDrop(img1, img2).perform();
		
		
		
		
		
	}

}
