
//package day3;
//
//import java.time.Duration;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class WindowHandle {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        try {
//            driver.manage().window().maximize();
//            driver.get("https://www.salesforce.com/au/");
//
//            // 1) Accept cookies if the OneTrust banner appears (id is common on many sites)
//            try {
//                wait.withTimeout(Duration.ofSeconds(5))
//                    .until(ExpectedConditions
//                        .elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();
//            } catch (TimeoutException ignored) { /* banner not shown, continue */ }
//
//            // 2) Click a stable "Try for free" link (your aria-label was too specific/outdated)
//            //    Pick the first visible "Try for free" on the page.
//            WebElement tryBtn = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("(//a[normalize-space()='Try for free'])[1]")));
//            String parent = driver.getWindowHandle();
//            tryBtn.click();
//
//            // 3) Switch to the new tab/window
//            wait.until(d -> d.getWindowHandles().size() > 1);
//            for (String h : driver.getWindowHandles()) {
//                if (!h.equals(parent)) {
//                    driver.switchTo().window(h);
//                    break;
//                }
//            }
//
//            // 4) Verify the Free Trial page loaded
//            wait.until(ExpectedConditions.or(
//                ExpectedConditions.urlContains("/form/signup/freetrial"),
//                ExpectedConditions.visibilityOfElementLocated(
//                    By.xpath("//*[contains(.,'Start your free') or contains(.,'free trial')]"))
//            ));
//
//            System.out.println("On Free Trial page: " + driver.getTitle());
//
//            // 5) (Optional) Close child and return to parent
//            driver.close();
//            driver.switchTo().window(parent);
//        } finally {
//            driver.quit();
//        }
//        
//    }
//}
/*
package day3;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1. Open website
        driver.get("https://www.salesforce.com/au/");

        // 2. Get the main window handle
        String parentWindow = driver.getWindowHandle();

        // 3. Click on "Try for free" link (opens new tab)
        WebElement freeTrial = driver.findElement(By.xpath("(//a[normalize-space()='Try for free'])[1]"));
        freeTrial.click();

        // 4. Get all handles
        Set<String> allWindows = driver.getWindowHandles();

        // 5. Switch to child window
        for (String handle : allWindows) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                System.out.println("Child window title: " + driver.getTitle());
            }
        }

        // 6. Close child window
        driver.close();

        // 7. Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window: " + driver.getTitle());

        driver.quit();
    }
}*/

package day3;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		
		Set<String> parentchild=driver.getWindowHandles();
		System.out.println(parentchild);
		
		driver.close();
		
		
		
	}
}

