package com.demoblaze.TestBaseLayer;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demoblaze.PageLayer.CartPage;
import com.demoblaze.PageLayer.ConfirmationPage;
import com.demoblaze.PageLayer.HomePage;
import com.demoblaze.PageLayer.LoginPage;
import com.demoblaze.PageLayer.ProductPage;
import com.demoblaze.util.ReadConfig;
import com.demoblaze.util.ReadExcel;
import com.demoblaze.util.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	//=============Object Reference Variables===========================
	public static WebDriver driver;
	public HomePage home_obj;
	public LoginPage login_obj;
	public ProductPage product_obj;
	public static Utilities util_obj;
	public CartPage cart_obj;
	public ConfirmationPage confirm_obj;
	public static ReadConfig read_file;
	public static ReadExcel read_data;
	
	@BeforeMethod
	public void launchBrowser() throws FileNotFoundException
	{
		String br="chrome";

		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter correct browser details");
		}
		//==================================================
		read_file=new ReadConfig();
		//===================================================
		driver.get(read_file.getUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//=============Object Creation=======================
		
		home_obj=new HomePage();
		login_obj=new LoginPage();
		product_obj=new ProductPage();
		util_obj=new Utilities();
		cart_obj=new CartPage();
		confirm_obj=new ConfirmationPage();
		read_data=new ReadExcel();
		
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}

