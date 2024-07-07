package Amazon_Program;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class username
{
	@Test
	public static void login() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); 
		WebElement account = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement sign = driver.findElement(By.linkText("Sign in"));
		sign.click();
		driver.findElement(By.id("ap_email")).sendKeys("hemantdhoot0@gmail.com");
		driver.findElement(By.id("continue")).click();

	}

}
