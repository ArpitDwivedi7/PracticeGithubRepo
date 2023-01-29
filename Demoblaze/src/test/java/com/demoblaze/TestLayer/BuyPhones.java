package com.demoblaze.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.TestBaseLayer.TestBase;

public class BuyPhones extends TestBase
{

	@Test
	public void buyPhonesWithoutLogin() throws InterruptedException
	{
		//==============Object creation=============

		
		//==============method call===================
		
		home_obj.clickOnPhonesLink();
		home_obj.clickOnSamsungGalaxyS6Link();
		product_obj.addToCartButton();
		
		Thread.sleep(2000);
		util_obj.accept();
		
		home_obj.clickOnCartLink();
		
		cart_obj.clickOnPlaceOrderButton();
		
		cart_obj.enterName();
		cart_obj.enterCountry();
		cart_obj.enterCity();
		cart_obj.entercardDetails();
		cart_obj.enterMonth();
		cart_obj.enterYear();
		cart_obj.clickOnPurchaseButton();
		
		String expected_msg="Thank you for your purchase!";
		
		String actual_msg=confirm_obj.verifyOrderConfirmation();
		
		Assert.assertEquals(actual_msg, expected_msg);
	}
	
	
	
	
}
