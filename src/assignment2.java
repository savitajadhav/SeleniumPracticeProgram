import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\savita.jadhav\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
     /* driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1561974552&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3de0d6a9c8-d2bf-720d-e22c-84bf6aba1421&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
      driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("savita.jadhav@effective.digital");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
      //Go to idbi bank site, select 'Cards' from Netbanking and click on Login button
      driver.get("https://www.idbibank.in/index.asp");
      driver.findElement(By.id("urlValue")).sendKeys("Cards");
      driver.findElement(By.xpath("//img[starts-with(@alt,'Net Banking Login')]")).click();*/
      //Go to axisbank site , go to 'Bank Smart'>Mobile Banking> SMS Banking
      //driver.manage().window().maximize();
      driver.get("http://www.axisbank.com/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='topMenu personalHeader'/div/div/div[1]/div[3]/ul/li[4]/a]")).click();
		//driver.get("http://www.axisbank.com/");
		//driver.findElement(By.xpath("//h4[normalize-space()='Mobile Banking']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='accordion']//li/a[normalize-space()='SMS Banking']")).click();

      
      
      
      
	}

}
