package com.testpackage;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basepackage.Takescreenshot;
import com.basepackage.TestBase;

import com.qa.pages.HomepageMyntra;

import com.qa.pages.LoginPageMyntra;


@Listeners(Takescreenshot.class)
public class LoginpageMyntraTest extends TestBase{
	
	LoginPageMyntra loginpage;
	HomepageMyntra homepage;

	public LoginpageMyntraTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeClass
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPageMyntra();
	}
	
	@Test(retryAnalyzer=com.retrylogic.retryTest.class, priority=1)
	public void title() {
		
		String actual_title=loginpage.verify_title();
		
		Assert.assertEquals(actual_title, "Online Shopping for Women");
		
	}
	 
	@Test(retryAnalyzer=com.retrylogic.retryTest.class,priority=2)
	public void loginmyntra() throws InterruptedException, FileNotFoundException {
		homepage=loginpage.verify_login(prop.getProperty("username"),prop.getProperty("password"));
	}
}
