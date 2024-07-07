package DataProviderTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting3
{
	@DataProvider(name = "data1")
	public Object [][] method1()
	{
		Object [][] o1 = new Object[10][3];
		return o1;
	}
	
	@Test(dataProvider = "data1")
	public void testcase1(String name, String password, int number)
	{
		
	}
}
