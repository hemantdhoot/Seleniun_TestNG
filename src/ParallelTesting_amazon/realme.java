package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class realme extends Launch_Quit
{
	@Test
	public void mob()
	{
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("realme")).click();
	}
}
