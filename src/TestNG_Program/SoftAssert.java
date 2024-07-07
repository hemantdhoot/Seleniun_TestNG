package TestNG_Program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SoftAssert {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		Set <String> id = driver.getWindowHandles();
		SoftAssert s1 = new SoftAssert();   // program run continuosly even result  will fail
		Assert.assertEquals(id.size(), 1);
		s.sendKeys("shoe");
		s.sendKeys(Keys.ENTER);
		WebElement sh = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		sh.click();
		
		

	}

}
