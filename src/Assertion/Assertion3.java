package Assertion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 
{
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void shoes()
	{
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("shoe");
		s.sendKeys(Keys.ENTER);
		WebElement sh = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		sh.click();
		
		Set <String> id = driver.getWindowHandles();
		id.size();
		
		
		//Assert.assertEquals(id.size(), 1);   // fail
		Assert.assertEquals(id.size(), 2);     //pass
		
		
	}
}
