package com.demoblaze.util;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demoblaze.TestBaseLayer.TestBase;

public class ListenerSetup extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case Execution Completed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case Execution Failed ");
		util_obj.screenshot(result.getName()+System.currentTimeMillis());
		System.out.println("Screenshot Taken Successfully ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case Skipped");
	}

	
	
	
	
	
	
	
	
}
