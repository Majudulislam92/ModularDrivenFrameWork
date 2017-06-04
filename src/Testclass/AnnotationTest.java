package Testclass;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
    @BeforeSuite
    public void beforesuite(){
    	System.out.println("****Test Suite Started****");
    }
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before the test");
	}


	@AfterTest 
	public void afterTest(){
		System.out.println("after the test");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before the method");
	}
	@Test (priority=3)
	public void logoutTest(){
		System.out.println("Log at the End");

	}
	@Test (priority=1)
	public void loginTest(){
		System.out.println("log in");
	}
	@Test (priority=2)
	public void changepassword(){
		System.out.println("change password");
	}
	@Test (priority=4)
	public void skiptest(){
		System.out.println("skiptest");
		
	}
	//skipping test= will show report 


	@Test (priority=5, enabled=false)
	public void disableTest(){
		System.out.println("disabletest");
	}
	// disable the test= does not show in the report   (enabled=false)

}


