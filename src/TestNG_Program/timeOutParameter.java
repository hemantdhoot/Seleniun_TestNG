package TestNG_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeOutParameter 
{
	@Test(timeOut=10000)  // 1000 mean 1 ms, 10000 mean 10 sec in this parameter
	public void Testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Asop");
		
		
		//Exception is ThreadTimeoutException
	}
}
