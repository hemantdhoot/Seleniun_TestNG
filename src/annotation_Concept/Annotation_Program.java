package annotation_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Program 
{
	@Test
	public static void testcase1()
	{
		System.out.println("testcase1");
	}
	@BeforeSuite
	public static void bs()
	{
		System.out.println("bs");
	}
	@AfterSuite
	public static void as()
	{
		System.out.println("as");
	}
	@BeforeTest
	public static void bt()
	{
		System.out.println("bt");
	}
	@AfterTest
	public static void at()
	{
		System.out.println("at");
	}
	@BeforeClass
	public static void testcase6()
	{
		System.out.println("bc");
	}
	@AfterClass
	public static void ac()
	{
		System.out.println("ac");
	}
	@AfterMethod
	public static void am()
	{
		System.out.println("am");
	}
	@BeforeMethod
	public static void bm()
	{
		System.out.println("bm");
	}
}
