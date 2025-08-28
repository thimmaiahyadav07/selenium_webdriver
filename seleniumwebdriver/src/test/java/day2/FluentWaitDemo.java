//package day2;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//public class FluentWaitDemo
//{
//	public static void main(String[] args)
//	{
//		 WebDriver driver=new ChromeDriver();
//		 //fluent wait decleration
//		 Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver);
		 		/*.withTimeout(Duration.ofSeconds(30))
		 		.pollingEvery(Duration.ofSeconds(5))
		 		.ignoring(NoSuchElementException.class);
		 
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
		 
		 
		 //driver.findElement(By.name("username")).sendKeys("Admin");
		   WebElement textUsername mywait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(By.id("elementId")); // Condition to wait for
	            }
	        });
		 driver.close();
	}

	private static FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	
}*/


