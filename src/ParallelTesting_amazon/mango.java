package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mango extends Launch_Quit
{
	@Test
	public void amazonfresh()
	{
		WebElement category = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(category);
		s1.selectByIndex(4);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mango");
		search.sendKeys(Keys.ENTER);
	}
}
