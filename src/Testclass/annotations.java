package  Testclass;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class annotations {


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
		throw new SkipException("im still working on it");
	}
//skipping test= will show report 
	

	@Test (priority=5, enabled=false)
	public void disableTest(){
		System.out.println("disabletest");
	}
	// disable the test= does not show in the report   (enabled=false)

}
