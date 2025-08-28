package day5;
//Handle alert without using switchTo().alert()
//by using explicit wait

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlealertUsingExplicitWait 
{
	public static void mains(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1)Normal alerts with ok button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); //capture alerts
		
		
		System.out.println((myalert.getText()));
		myalert.accept();
	}
	

}
