package com.demoblaze.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBaseLayer.TestBase;

public class CartPage extends TestBase
{
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//==============Object Repo==================
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	private WebElement place_order_btn;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name_txtbox;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country_txtbox;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city_txtbox;
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement card_details_txtbox;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement month_txtbox;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement year_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	private WebElement purchase_btn;
	
	
	//==============Action Methods==================
	
	public void clickOnPlaceOrderButton()
	{
		place_order_btn.click();
	}
	
	public void enterName()
	{
		name_txtbox.sendKeys("A");
	}
	public void enterCountry()
	{
		country_txtbox.sendKeys("India");
	}
	public void enterCity()
	{
		city_txtbox.sendKeys("Jaipur");
	}
	public void entercardDetails()
	{
		card_details_txtbox.sendKeys("1234567890");
	}
	public void enterMonth()
	{
		month_txtbox.sendKeys("January");
	}
	public void enterYear()
	{
		year_txtbox.sendKeys("2023");
	}
	public void clickOnPurchaseButton()
	{
		purchase_btn.click();
		
	}
	
}
