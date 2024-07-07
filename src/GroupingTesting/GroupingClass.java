package GroupingTesting;

import org.testng.annotations.Test;

public class GroupingClass
{
	@Test(groups = {"smoke", "system"})
	public void Testcase1() 
	{

	}

	@Test(groups = {"smoke"})
	public void Testcase2() 
	{

	}

	@Test(groups = {"system"})
	public void Testcase3() 
	{

	}

	@Test(groups = {"smoke"})
	public void Testcase4() 
	{

	}

	@Test(groups = {"system"})
	public void Testcase5() 
	{

	}
}
