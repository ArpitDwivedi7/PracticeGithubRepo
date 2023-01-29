package com.demoblaze.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.demoblaze.TestBaseLayer.TestBase;

public class ReadConfig extends TestBase
{

	private Properties pro;
	
	public ReadConfig() throws FileNotFoundException
	{
		String path="E:\\VelocityTraining\\NOTES\\JAVA\\FRAMEWORK\\GitHubRepositoryForPractice\\PracticeGithubRepo\\Demoblaze\\src\\test\\resources\\config\\Config.properties";
		
		try {
			File file=new File(path);
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}
	public String getUserName()
	{
		return pro.getProperty("username");
	}
	public String getPassword()
	{
		return pro.getProperty("password");
	}
	
}
