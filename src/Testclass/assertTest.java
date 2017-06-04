package Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class assertTest {
	SoftAssert softAssert= new SoftAssert();
	
			
			
	@Test (priority=1)
	public void assertPass(){
	String act="abc";
	String exp="abc";
	
	Assert.assertEquals(act,exp);
	System.out.println("TC1: Pass");
			}
	
	
	@Test (priority=2)
	public void Softassert(){
	String act="abc";
	String exp="abcd";
	System.err.println("TC 2: Going to fail with Softassert");
	Assert.assertEquals(act,exp);
	System.err.println("soft assert working");
	softAssert .assertAll();		
	
	}

     @Test (priority=3)
	public void assertfail(){
	String act="abc";
	String exp="abcd";
	
	Assert.assertEquals(act,exp);
	System.err.println("fail the test");
			}





}
