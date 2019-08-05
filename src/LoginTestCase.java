import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savita.jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aws-dev-1be627-c.adweb.com.au/cfr/user/login.aspx");
		//Find Elements by id
		/*driver.findElement(By.id("textUsername")).sendKeys("iphone");
		driver.findElement(By.id("textPassword")).sendKeys("iphone@123");
		driver.findElement(By.id("btnLogin")).click();
		//Find elements by Name
		driver.findElement(By.name("textUsername")).sendKeys("iphone");
		driver.findElement(By.name("textPassword")).sendKeys("iphone@123");
		driver.findElement(By.name("btnLogin")).click();
		//Find element by Class Name
		driver.findElement(By.name("textUsername")).sendKeys("iphone");
		driver.findElement(By.name("textPassword")).sendKeys("iphone@123");
		driver.findElement(By.className("button")).click();*/
		//Find element by Tag Name
		driver.findElement(By.name("textUsername")).sendKeys("iphone");
		driver.findElement(By.name("textPassword")).sendKeys("iphone@123");
		driver.findElement(By.tagName("input")).click();

	}

}
