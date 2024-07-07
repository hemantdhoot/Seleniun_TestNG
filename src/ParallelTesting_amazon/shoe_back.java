package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class shoe_back extends Launch_Quit
{
		@Test
		public void mob()
		{
			WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
			s.sendKeys("shoe");
			s.sendKeys(Keys.ENTER);
			driver.navigate().back();
		}
}
