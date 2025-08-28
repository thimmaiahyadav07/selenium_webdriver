//package day1;
//
//import java.time.Duration;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class orangehrm 
//{
//	public static void main(String[] args)
//	{
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        // 1) Full page screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//
//        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
//
//        // Create folder if not exists
//        targetFile.getParentFile().mkdirs();
//
//        FileHandler.copy(sourceFile, targetFile);
//
//        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());
//	}
//
//}

package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class orangehrm 
{
    public static void main(String[] args) throws IOException 
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // 1) Full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");

        // Create folder if not exists
        targetFile.getParentFile().mkdirs();

        FileHandler.copy(sourceFile, targetFile);

        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());

        driver.quit();  // Close browser after execution
    }
}

