import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {

		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savita.jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://aws-dev-1be627.adweb.com.au");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("The title of URL is :" +driver.getTitle());
		System.out.println("The length of title is:" +driver.getTitle().length());
		System.out.println("The current URL is:" +driver.getCurrentUrl());
		System.out.println("The source code is:" +driver.getPageSource());
		System.out.println("The length of pageSource is:" +driver.getPageSource().length());
		driver.close();

	}

}
