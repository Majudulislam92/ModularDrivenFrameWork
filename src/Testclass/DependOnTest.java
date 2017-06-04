package Testclass;

import org.testng.annotations.Test;

public class DependOnTest {
	


		@Test (dependsOnMethods= {"change password"})
		public void logoutTest(){
			System.out.println("Logout at the End");

		}
		@Test 
		public void loginTest(){
			System.out.println("log in");
		}
		@Test 
		public void changepassword(){
			System.out.println("change password");
		}
	
			
		}
	
	
