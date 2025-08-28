package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1) Full page screenshot
        /*TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");

        // Create folder if not exists
        targetFile.getParentFile().mkdirs();

        FileHandler.copy(sourceFile, targetFile);

        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());
        */

     
        
        //2)capture the screenshort of specific section
        /*WebElement featureproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile=featureproducts.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\screenshorts\\featureproducts.png");
        sourcefile.renameTo(targetfile); //copy sourcefile to target file
        driver.quit();*/
        
        //3)capture the scrennshort of webelement
         WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
         File sourcefile= logo.getScreenshotAs(OutputType.FILE);
         File targetfile=new File(System.getProperty("user.dir")+"\\screenshorts\\logo.png");
         sourcefile.renameTo(targetfile); //copy sourcefile to target file
         driver.quit();
        
        
        
    }
}

