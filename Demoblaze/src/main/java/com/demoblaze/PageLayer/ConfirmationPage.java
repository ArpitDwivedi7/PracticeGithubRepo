package com.demoblaze.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBaseLayer.TestBase;

public class ConfirmationPage extends TestBase
{
	public ConfirmationPage()
	{
		PageFactory.initElements(driver,this);
	}

	//==============Object Repo==================

	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement confirm_msg;
	
	
	//==============Action Methods==================
	
	public String verifyOrderConfirmation()
	{
		return confirm_msg.getText();
	}
	
	
}
