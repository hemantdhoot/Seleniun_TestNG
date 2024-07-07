package Listener_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Test.class)
public class TestCase extends Listener_Test
{
	
	@Test
	public static void shoes()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("shoe");
		s.sendKeys(Keys.ENTER);
		WebElement sh = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		sh.click();
	}
}
