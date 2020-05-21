package testpack;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void posttest()
	{
		System.out.println("post test");
	}
	@Test(groups={"smoke"})
	public void demo()
	{
		System.out.println("hi");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("After suite");
	}
	@Test
	public void secondtest()
	{
		System.out.println("test2");
	}
	

}
