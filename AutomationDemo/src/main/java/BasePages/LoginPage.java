package BasePages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class LoginPage
	{
	WebDriver driver;
	     
		//constructor -->initilize the driver -->constructor name same as classname

		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		//locators
		
		By text_username_loc=By.xpath("//input[@placeholder='Username']");
		By text_password_loc=By.xpath("//input[@placeholder='Password']");
		By btn_login_loc=By.xpath("//button[@type='submit']");
		
		//Action methods
		
		public void setUserName(String user)
		{
			driver.findElement(text_username_loc).sendKeys("user");
			
			
		}
		public void setPassword(String pwd)
		{
			driver.findElement(text_password_loc).sendKeys("pwd");
		}
		
		public void ClickLogin()
		{
			driver.findElement(btn_login_loc).click();
		}
		

	}


