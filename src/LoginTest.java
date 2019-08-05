import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest{
	
	public WebDriver driver;
 //PageFactory.initElements(driver, this);

	//WebElement username = driver.findElement(By.xpath("//input[@name='log']"));                              //input[@name='log']])
	@FindBy(xpath="//input[@name='log']")
	WebElement username; 
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='login_error']")
	WebElement errorMessage;
	
	
	@BeforeMethod
	public void Initialization()
	    {
		  System.setProperty("webdriver.chrome.driver", "C://Users//savita.jadhav//Downloads//chromedriver_win32//chromedriver.exe");
		  driver = new ChromeDriver();
		  PageFactory.initElements(driver, this);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://qa.rtcamp.net/activity/");
		} 

	
		//Test case 1: Both User name and Password are entered correctly. 
	   @Test(priority=1)
	   public void loginwithValidData() throws InterruptedException 
	   {
		 
		username.sendKeys("demo");
		password.sendKeys("demo");
		loginBtn.click();	
		Thread.sleep(2000);
		System.out.println("Test case1: User logged in successfully");
	   }
	   
	   //Test case2 : Invalid credentials(valid username and Invalid password)
	   @Test(priority=2)
	   public void loginwithInvalidData() throws InterruptedException 
	   {
		   username.sendKeys("demo");
		   password.sendKeys("demo1");
		   loginBtn.click();
		   Thread.sleep(2000);
		   System.out.println("Test Case2:" +errorMessage.getText());
	   }
	   
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}

	   
}
