package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 
{
	@Test
	public void amazon()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://www.amazon.in/");
	WebElement signin1 = driver.findElement(By.className("nav-line-2"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signin1).perform();
	WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
	WebElement un = driver.findElement(By.id("ap_email"));
			un.sendKeys("hemantdhoot0@gmail.com");
	WebElement continuec  = driver.findElement(By.id("continue"));
			continuec.click();
	WebElement pw = driver.findElement(By.id("ap_password"));
		pw.sendKeys("Aakash7869@");
	WebElement signinbutton  = driver.findElement(By.id("signInSubmit"));
		signinbutton.click();
		
	WebElement name = driver.findElement(By.partialLinkText("Hemant"));
		
		Assert.assertEquals(name.isDisplayed(), true);
	}
}
