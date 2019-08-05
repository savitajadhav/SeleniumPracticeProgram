import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignemnt3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\savita.jadhav\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)

		List<WebElement> radioButton_sex = driver.findElements(By.name("sex"));
		for(WebElement s: radioButton_sex)
		{
			System.out.println(s.getAttribute("value"));
		}
		Thread.sleep(2000);
		boolean bvalue = true;
		bvalue= radioButton_sex.get(0).isSelected();
		if(bvalue==false) {
			radioButton_sex.get(1).click();
		}
		else {
			radioButton_sex.get(0).click();
		}
		Thread.sleep(2000);
		//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)

		driver.findElement(By.id("exp-2")).click();
		Thread.sleep(2000);
		//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        //driver.findElement(By.id("profession-1")).click();
		List<WebElement> checkBox_skill = driver.findElements(By.name("profession"));
		for(WebElement lst: checkBox_skill) {
			System.out.println(lst.getAttribute("value"));
		}
		
		for(int i=0;i< checkBox_skill.size();i++)
		{
			String sValue=  checkBox_skill.get(i).getAttribute("value");
			if(sValue.equalsIgnoreCase("Automation Tester")){
				   Thread.sleep(2000);
					checkBox_skill.get(i).click();
					break;
			}
		}
		Thread.sleep(2000);
		//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
        driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		
        Thread.sleep(2000);
		driver.close();
	}

}
