package com.demoblaze.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBaseLayer.TestBase;

public class ProductPage extends TestBase
{

	public ProductPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//==============Object Repo==================
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;
	
	//====================Methods========================
	
	public void addToCartButton()
	{
		add_to_cart_btn.click();
	}
}
