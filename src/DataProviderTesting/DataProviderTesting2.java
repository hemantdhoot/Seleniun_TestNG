package DataProviderTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting2 
{
	@DataProvider(name ="data1")
	public Object [][] method1()
	{
		Object d1[][] = new Object[2][4];
		d1[0][0] = "hemant@gmail"; 
		d1[0][1] = "hemant123"; 
		d1[0][2] = "hemant"; 
		d1[0][3] = "dhoot"; 
		
		d1[1][0] = "aakash@gmail"; 
		d1[1][1] = "aakash123"; 
		d1[1][2] = "aakash"; 
		d1[1][3] = "maheswari"; 
		
		return d1;
	}
	
	@Test(dataProvider ="data1")
	public void Testcase1(String gmail, String password, String fname, String lname)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	driver.findElement(By.name("reg_email__")).sendKeys(gmail);
	driver.findElement(By.id("password_step_input")).sendKeys(password);
	driver.findElement(By.name("firstname")).sendKeys(fname);
	driver.findElement(By.name("lastname")).sendKeys(lname);
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select s1 = new Select(day);
	s1.selectByValue("28");
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select s2 = new Select(month);
	s2.selectByVisibleText("Jun");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select s3 = new Select(year);
	s3.selectByVisibleText("2005");
	WebElement gender = driver.findElement(By.xpath("(//label[@class = '_58mt'])[2]"));
	gender.click();
	}
}
