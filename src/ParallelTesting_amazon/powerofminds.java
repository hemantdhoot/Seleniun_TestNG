package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class powerofminds extends Launch_Quit
{
		@Test
		public void book()
		{
			WebElement search  = driver.findElement(By.id("searchDropdownBox"));
			Select s1 = new Select(search);
			s1.selectByIndex(10);
			WebElement books = driver.findElement(By.id("twotabsearchtextbox"));
			books.sendKeys("power of minds");
			books.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		}
}
