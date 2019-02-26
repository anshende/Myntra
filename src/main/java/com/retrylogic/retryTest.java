package com.retrylogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class retryTest implements IRetryAnalyzer{
	
	int counter=0;
	
	int limit=3;
	
	public boolean retry(ITestResult result)
	{
		if(counter<limit)
		{
			counter++;
			return true;
		}
		else
			return false;
	}
	
	
	

}
