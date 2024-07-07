package Assertion;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 
{
	@Test
	public void amazoncart() throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String Parentid = i1.next();
		String childid = i1.next();
		System.out.println(Parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		
		//Assert.assertEquals(cart.isEnabled(), true, "add to cart button is displayed");
		Assert.assertEquals(cart.isDisplayed(), true, "add to cart button is displayed");
	}
}
