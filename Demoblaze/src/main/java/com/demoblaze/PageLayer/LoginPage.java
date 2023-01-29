package com.demoblaze.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBaseLayer.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//==============Object Repo==================
	

	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement username_txtbox;

	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement password_txtbox;

	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement verify_user_login;
	
	
	//====================Methods========================
	
	public void enterUserName()
	{
		username_txtbox.sendKeys(read_data.readData("Login Data",1,0));
	}

	public void enterPassword()
	{
		password_txtbox.sendKeys(read_file.getPassword());
	}

	public void clickOnLoginButton()
	{
		login_btn.click();
	}

	public String verifyUserLogin()
	{
		String msg= verify_user_login.getText();
		return msg;
	}
	
	
	
}
