import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\savita.jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        driver.get("https://aws-dev-1be627-c.adweb.com.au");
		//System.out.println("The tilte of the Page:" + driver.getTitle());
        //Find the title of the element without using getTitle() 
       WebElement titleText = driver.findElement(By.tagName("title"));
		System.out.println("The tilte of the Page:" + titleText.getAttribute("textContent"));

	}

}
