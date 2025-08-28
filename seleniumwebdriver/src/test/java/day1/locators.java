package day1;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean displaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(displaystatus);
		
		//linktext &partiallinktext
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.partialLinkText("Table")).click();
		//clas Nname
		
		//List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("total num of head links:"+headerlinks.size());
		
		//tagname
		
		//List<WebElement> links= driver.findElements(By.tagName("a"));
		//System.out.println("total num of links:"+links.size());
		
		}

}
