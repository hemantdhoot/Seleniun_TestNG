package TestNG_Program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait 
{
@Test
	public static void Link()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
	driver.get("https://www.google.com");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count = links.size();
	System.out.println(count);
	for(int i =0; i<count; i++)
	{
	WebElement s1	= links.get(i);
	String linkl1 = s1.getAttribute("href");
	System.out.println(linkl1);
	String linkl2 = s1.getText();
	System.out.println(linkl2);
	}
	}
}
