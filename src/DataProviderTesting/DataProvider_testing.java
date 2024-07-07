package DataProviderTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataProvider_testing
	{
		@DataProvider(name = "data1")
		public Object[] [] method1()
		{
			return new Object[] [] {{"ram"}, {"lakshman"},{"shiva"}, {"sita"}};
		}
	
		@Test(dataProvider ="data1")
		public void TestCase1(String name)
		{
			System.out.println(name.concat("india"));
		}
}
