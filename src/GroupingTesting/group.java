package GroupingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class group
{
	@Test(groups = {"component"})
	public void Testcase1()
	{	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		WebElement c = driver.findElement(By.id("twotabsearchtextbox"));
		c.sendKeys("camera");
		c.sendKeys(Keys.ENTER);
		WebElement c35 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[20]"));
		c35.click();
	}
	@Test(groups = {"smoke"})
	public void Testcase2()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		WebElement deal = driver.findElement(By.linkText("Today's Deals"));
		deal.click();
		WebElement todayd = driver.findElement(By.xpath("(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[1]"));
		todayd.sendKeys(Keys.ENTER);
	}
	@Test(groups = {"system"})
	public void Testcase3()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		WebElement category = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(category);
		s1.selectByIndex(4);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mango");
		search.sendKeys(Keys.ENTER);
	}
	@Test(groups= {"integrating"})
	public void Testcase4()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Get It in 2 Days")).click();
	}
}
