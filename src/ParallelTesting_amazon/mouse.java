package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mouse extends Launch_Quit
{
	@Test
	public void mousec()
	{
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Get It in 2 Days")).click();
	//	WebElement prod = driver.findElement(By.xpath("(//span[@class='rush-component'])[1]"));
	//	prod.sendKeys(Keys.ENTER);
	}
}
