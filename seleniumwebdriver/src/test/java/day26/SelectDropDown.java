/*package day26;

import java.time.Duration;

import org.junit.platform.suite.api.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDown 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dry_countryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dry_country=new Select(dry_countryEle);
		
		//select option from the drop down
		dry_country.selectByVisibleText("france");
		
		
	}

}*/

package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectDropDown 
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dry_countryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select dry_country = new Select(dry_countryEle);

        // select option from the drop down
        dry_country.selectByVisibleText("France"); // Note: 'France' should match case-sensitive
        
        //capture the options from the dropdown
        List<WebElement>options=dry_country.getOptions();
        System.out.printf("number of options in drop down",+options.size());//10
        
        //printing the options 
        for(int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

