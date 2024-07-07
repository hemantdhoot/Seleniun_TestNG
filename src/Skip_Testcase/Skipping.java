package Skip_Testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Skipping 
{
	@Test
	public void login()
	{
		//logic
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
}
