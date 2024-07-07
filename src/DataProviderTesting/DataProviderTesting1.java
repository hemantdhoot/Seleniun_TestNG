package DataProviderTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting1 
{
	WebDriver driver;
	@DataProvider(name = "login")   //dataprovider method have return type object of 2 dimensions
	public Object[] [] method1()    // here object is compulsory
	{
		Object d1 [][]= new Object[5][2];
		//1st user
		d1[0][0] = "hemant@gmail.com"; 
		d1[0][1] = "hemant"; 
		//2nd user
		d1[1][0] = "aakash@gmail.com"; 
		d1[1][1] = "aakash"; 
		//3rd user
		d1[2][0] = "sagar@gmail.com"; 
		d1[2][1] = "sagar"; 
		//4th user
		d1[3][0] = "kajal@gmail.com"; 
		d1[3][1] = "kajal"; 
		//5th user
		d1[4][0] = "himani@gmail.com"; 
		d1[4][1] = "himani"; 
		return d1; // whenever return type other than void than we user return keyword
	}

	@Test(dataProvider ="login")
	public void TestCase1(String username, String password)
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
				un.sendKeys(username);
		WebElement continuec  = driver.findElement(By.id("continue"));
				continuec.click();
		WebElement pw = driver.findElement(By.id("ap_password"));
			pw.sendKeys(password);
		WebElement signinbutton  = driver.findElement(By.id("signInSubmit"));
			signinbutton.click();
	}
}
