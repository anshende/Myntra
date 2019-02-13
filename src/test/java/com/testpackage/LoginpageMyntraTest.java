package com.testpackage;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basepackage.TestBase;

import com.qa.pages.HomepageMyntra;

import com.qa.pages.LoginPageMyntra;

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
	
	@Test(priority=1)
	public void title() {
		
		String actual_title=loginpage.verify_title();
		
		Assert.assertEquals(actual_title, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
		
	}
	
	@Test(priority=2)
	public void loginmyntra() throws InterruptedException, FileNotFoundException {
		homepage=loginpage.verify_login(prop.getProperty("username"),prop.getProperty("password"));
	}
}
