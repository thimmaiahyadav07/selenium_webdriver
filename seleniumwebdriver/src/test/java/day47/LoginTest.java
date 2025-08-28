//package day47;
//import java.time.Duration;
//
//import org.junit.Test;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import junit.framework.Assert;
//
//public class LoginTest 
//{
//	static WebDriver driver;
//	@BeforeAll
//	public static void setup()
//	{
//		WebDriver deiver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		
//		
//		
//		
//		
//	}
//	@Test
//	public static void testlogin()
//	{
//		LoginPage lp=new LoginPage(driver);
//		lp.setUserName("Admin");
//		lp.setPassword("admin123");
//		lp.ClickLogin();
//		
//		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
//		
//		
//	}
//	@AfterAll
//	public static void tearDown()
//	{
//		driver.quit();
//		
//	}
//
//}

package day47;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    static WebDriver driver;

    @BeforeAll
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
}
