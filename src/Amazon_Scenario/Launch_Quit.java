package Amazon_Scenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{
	WebDriver driver;
@BeforeMethod
	public void launch() throws InterruptedException
	{
	driver = new ChromeDriver();
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
	}
@AfterMethod
	public void Quit() throws IOException
	{
	TakesScreenshot a1 = (TakesScreenshot) driver;
	File source = a1.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\aakash dhoot\\Desktop\\gro screenshot\\hemant"+Math.random()+".png");
	FileHandler.copy(source, destination);
	WebElement logout1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(logout1).perform();
	WebElement logout = driver.findElement(By.id("nav-item-signout"));
	logout.click();
	}
}
