package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mobilecover extends Launch_Quit
{
		@Test
		public void cover()
		{
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("mobile cover");
			search.sendKeys(Keys.ENTER);
			driver.findElement(By.linkText("Include Out of Stock")).click();
		}
}
