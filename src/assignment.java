import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\savita.jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	//Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
	driver.findElement(By.partialLinkText("Partial")).click();
	System.out.println("Partial Link Text Passed");
	//Identify Submit button with ‘tagName’, convert it in to string and print it on the console
    System.out.println(driver.findElement(By.tagName("button")).toString());
    // Click on "Link Text" link
    driver.findElement(By.linkText("Link Test")).click();
    System.out.println("Link Test passed");
 }
}