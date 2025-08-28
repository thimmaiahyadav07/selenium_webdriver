package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1)Normal alerts with ok button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert my_alert=driver.switchTo().alert();
		System.out.println((my_alert.getText()));
		my_alert.accept();*/
		
		//2)conformational alerts -ok &cancel
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();  //close alert using ok button
		driver.switchTo().alert().dismiss(); //close alert using cancell button */
		
		//3)prompt alerts -input box
		  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		  Thread.sleep(5000);
		  Alert myalert=driver.switchTo().alert();
		  myalert.sendKeys("Welcome");
		  myalert.accept();
		  
		
		
		
		
		
		
	}


}
