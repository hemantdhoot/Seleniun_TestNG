package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class camera extends Launch_Quit
{
	@Test
	public void cameradevice()
	{
		WebElement c = driver.findElement(By.id("twotabsearchtextbox"));
		c.sendKeys("camera");
		c.sendKeys(Keys.ENTER);
		WebElement c35 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[20]"));
		c35.click();
	}
}
