package TestNG_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
	
	@Test
	public static void LoginAmazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("hemantdhoot0@gmail.com");
		WebElement un_continue =driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement pw = driver.findElement(By.id("ap_password"));
		pw.sendKeys("shkjhfkjhek");
		WebElement un_signin = driver.findElement(By.id("signInSubmit"));
		un_signin.click();
	}

}
