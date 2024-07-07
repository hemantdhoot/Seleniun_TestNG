package Amazon_Scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase2 extends Launch_Quit
{
	@Test
	public void logout() throws InterruptedException
	{
		WebElement searching = driver.findElement(By.id("twotabsearchtextbox"));
			searching.sendKeys("shoes");
			searching.sendKeys(Keys.ENTER);
		WebElement shoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
			shoe.click();
			Set <String> s1 = driver.getWindowHandles();
			System.out.println(s1);
			Iterator<String> i1 = s1.iterator();
			String Parentid = i1.next();
			String childid = i1.next();
			System.out.println(Parentid);
			System.out.println(childid);
			driver.switchTo().window(childid);
			WebElement wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
			wishlist.click();
			Thread.sleep(2000);
			WebElement viewwishlist = driver.findElement(By.linkText("View Your List"));
			viewwishlist.click();
			WebElement cart = driver.findElement(By.linkText("Add to Cart"));
			cart.click();
	}
}
