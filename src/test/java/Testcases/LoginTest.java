package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(priority=1,groups="A")
	public void FirstTest() {
		System.out.println("First");
	}
	
	@Test(priority=2)
	public void SecondTest() {
		System.out.println("Second");
	}
	
	@BeforeMethod(groups="A")
	public void ThirdTest() {
		System.out.println("BM");
	}
	
	@AfterMethod
	public void FourthTest() {
		System.out.println("AM");
	}

}
