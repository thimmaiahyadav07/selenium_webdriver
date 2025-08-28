/*package Tests;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;

public class LoginTest {

    static WebDriver driver;

    @BeforeGroups
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        assertEquals("OrangeHRM", driver.getTitle());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}*/

package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePages.LoginPage;

public class LoginTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
   
    @Test
    public void testLogin()
    {
    	LoginPage lp=new LoginPage(driver);
    	lp.setUserName("Admin");
    	lp.setPassword("admin123");
    	lp.ClickLogin();
    }	
   


	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    } 
}



