package com.itc.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.itc.pages.ReciptPage;
import com.itc.util.BaseTestObject;

public class ReciptPageTest extends BaseTestObject{

	ReciptPage objReciptPage = null;
	LoginPageTest login=new LoginPageTest();
	boolean flag = false;
	boolean flag1 = false;
	boolean flag2=false;
	boolean titleflag=false;

	@Parameters({"browserType"})
	@Test(priority=1, enabled=true,groups="SanityTest")
	public void verifyuploadRecipt() throws Exception
	{
	try 
	{
		login.verifyLoginPage();
		objReciptPage = new ReciptPage(driver);
		objReciptPage.clickOnLisRecipt();
	    objReciptPage.uploadReciptUsingAutoIt();
	    flag1=objReciptPage.isResultPageDisplayed();
	    titleflag= objReciptPage.isTitleDisplayed();
	    
	} 
	
	catch (Exception e) 
	{
		e.printStackTrace();
	}

	}
	
	

	
	
}
