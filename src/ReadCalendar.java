import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadCalendar {

	public static void main(String[] args) throws ParseException, InterruptedException {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savita.jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']")).click();
		String myDate = "15/09/2019"; //user input date
		SimpleDateFormat dtfmt1 = new SimpleDateFormat("dd/MM/yyyy"); //Parse converting string into date format
		Date date = dtfmt1.parse(myDate);
		System.out.println("Date:" +date);
		SimpleDateFormat dtfmt2 = new SimpleDateFormat("MMMM yyyy"); //Returning Month & Year
		String expMonthYear = dtfmt2.format(date);
		System.out.println("Expected Month & Year:" +expMonthYear);
		SimpleDateFormat dtfmt3 = new SimpleDateFormat("dd");
		String day = dtfmt3.format(date);
		System.out.println("Day:"+day);
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		for(int i=1;i<24;i++) {
			String actMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div")).getText();
			System.out.println("actMonthYear:"+actMonthYear);
			if(expMonthYear.equals(actMonthYear)){
				//Thread.sleep(5000);
				WebElement element = driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div/div/p[text()='"+day+"']"));
				action.moveToElement(element).click().build().perform();
				Thread.sleep(5000);
				break;
			}else {
				WebElement element2 = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
				action.moveToElement(element2).click().build().perform();
			}
		}
		//driver.close();
		
		
	}

}
