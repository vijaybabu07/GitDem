package testpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_data1 {
	
	@AfterTest
	public void posttest()
	{
		System.out.println("post test");
	}
	@Parameters({"uname"})
	@Test
	public void demo(String username)
	{
		System.out.println("hi "+ username);
	}
	@Parameters({"fname","lname"})
	@Test
	public void completename(String firstname,String lastname)
	{
		System.out.println("fullname: "+firstname+" "+lastname);
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
