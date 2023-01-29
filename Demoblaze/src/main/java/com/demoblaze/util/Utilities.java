package com.demoblaze.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.demoblaze.TestBaseLayer.TestBase;

public class Utilities extends TestBase
{
	public void accept()
	{
		driver.switchTo().alert().accept();
	}

	public void screenshot(String filename)
	{
		String path="E:\\VelocityTraining\\NOTES\\JAVA\\FRAMEWORK\\GitHubRepositoryForPractice\\PracticeGithubRepo\\Demoblaze\\screenshot\\";
		try 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination=new File(path+filename+".png");
			FileHandler.copy(src, destination);
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
