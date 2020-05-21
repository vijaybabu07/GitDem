package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("before suite");
	}
	@BeforeMethod
	public void Bfmethod()
	{
		System.out.println("beforemethod:execute before every test in day 3 class");
	}
	@BeforeClass
	public void Bfclass()
	{
		System.out.println("before class:execute before every method in day 3 class");
	}
	@AfterClass
	public void Afclass()
	{
		System.out.println("After class:execute after every method in day 3 class");
	}
	
	@Test(timeOut=40000)
	public void webloginCarloan()
	{
		System.out.println("weblogincar");
	}
	@Test(groups={"smoke"})
	public void mobileSignInCarloan()
	{
		System.out.println("mobileSignincar");
	}
	@Test(enabled=false)
	public void mobileSignOutCarloan()
	{
		System.out.println("mobileSign Outcar");
	}
	@Test
	public void mobileloginCarloan()
	{
		System.out.println("mobilelogincar");
	}
	@Test(dependsOnMethods="webloginCarloan")
	public void apiloginCarloan()
	{
		System.out.println("apilogincar");
	}

}
