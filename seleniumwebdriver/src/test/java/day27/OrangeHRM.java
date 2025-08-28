
package day27;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        // auto-download matching chromedriver binary
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    public void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status, "Logo should be displayed.");
    }

    @Test(priority = 2)
    public void testAppUrl() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
                "The application URL does not match expected login URL.");
    }

    @Test(priority = 3, dependsOnMethods = {"testAppUrl"})
    public void testHomePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Page title mismatch.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



















