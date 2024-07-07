package Amazon_Program;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class addingincart
{
	@Test
	public static void logout()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in");
		WebElement account = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement sign = driver.findElement(By.linkText("Sign in"));
		sign.click();
		driver.findElement(By.id("ap_email")).sendKeys("hemantdhoot0@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Aakash7869@");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.className("nav-cart-icon nav-sprite")).click();
	}
}
