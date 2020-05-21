package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test 
	public void ThirdTest()
	{
		System.out.println("3rd Test");
	}
	@BeforeTest 
	public void Prerequisite()
	{
		System.out.println("Prerequisite");
	}
	@AfterClass
	public void Afclass()
	{
		System.out.println("After class:execute after every method in day 2 class");
	}
	@AfterMethod
	public void Afmethod()
	{
		System.out.println("after method:execute after every test in day 2 class");
	}
	
	
}
