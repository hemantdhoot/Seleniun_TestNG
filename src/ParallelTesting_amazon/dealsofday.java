package ParallelTesting_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dealsofday extends Launch_Quit
{
	@Test
	public void todaydeal()
	{
		WebElement deal = driver.findElement(By.linkText("Today's Deals"));
		deal.click();
		WebElement todayd = driver.findElement(By.xpath("(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[1]"));
		todayd.sendKeys(Keys.ENTER);
		//WebElement mob = driver.findElement(By.xpath("(//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf'])[1]"));
		//mob.sendKeys(Keys.ENTER);
	}
}
