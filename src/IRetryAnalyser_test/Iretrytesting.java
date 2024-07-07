package IRetryAnalyser_test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretrytesting implements IRetryAnalyzer
{
	int initialcount = 0;
	int retry_times = 3;

	@Override
	public boolean retry(ITestResult result)
	{
		while(initialcount<retry_times )  // we can use if else, for loop 
		{
			initialcount++;
			return true;
		}
		return false;
		   // dont retry
	}
	
}
