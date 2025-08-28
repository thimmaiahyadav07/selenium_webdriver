package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo 
{
	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();
		 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //decleration
		 
		 
		  
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
		 textusername.sendKeys("Admin");
		 
		 WebElement textpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='password']")));
		 textpassword.sendKeys("admin123");
		 
		 WebElement loginbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		 loginbtn.click();
		 
		
		 driver.close();
	}

}
