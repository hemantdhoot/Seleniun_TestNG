package TestNG_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait_Exception
{
	public class ExplicitWait 
	{
	@Test
		public void Launch_Google()
		{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//title is casesensitive
		w1.until(ExpectedConditions.titleIs("banglore"));   // title not same so gives exception TimeoutException
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
	}
}
