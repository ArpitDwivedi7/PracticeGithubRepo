package com.demoblaze.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.PageLayer.HomePage;
import com.demoblaze.PageLayer.LoginPage;
import com.demoblaze.TestBaseLayer.TestBase;

public class LoginFunctionality extends TestBase
{

	@Test
	public void verifyUserLoginOnHomePage() throws InterruptedException
	{
		String expected_status="Welcome 123@test";
		//==============Object creation=============

		HomePage home_obj=new HomePage();
		LoginPage login_obj=new LoginPage();
		//==============method call===================
		home_obj.clickOnLoginLink();
		login_obj.enterUserName();
		login_obj.enterPassword();
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
        String actual_status=login_obj.verifyUserLogin();
		//Assert.fail();
        Assert.assertEquals(actual_status, expected_status);
		

	}

}
