package SeleniumElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse {
	
	Actions actions;
	WebDriver driver;
	
	@Test
	public void mouseaction() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C://Suresh//Personal/Technology//Java//chromedriver.exe");
		driver=new ChromeDriver(options);
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Men"))).build().perform();
		driver.findElement(By.linkText("T-Shirts")).click();
		
//T-Shirts		
		Thread.sleep(10000);
		
	}

}
