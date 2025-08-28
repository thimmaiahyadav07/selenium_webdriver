package Pages;



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
	


