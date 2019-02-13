package com.testpackage;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basepackage.TestBase;
import com.qa.pages.HomepageMyntra;
import com.qa.pages.LoginPageMyntra;
import com.qa.pages.TshirtpageMyntra;

public class HomepageMyntraTest extends TestBase {
	LoginPageMyntra loginpage;
	HomepageMyntra homepage;
	TshirtpageMyntra tshirt;
	
	public HomepageMyntraTest() throws FileNotFoundException {
	    super();
	}
	
	@BeforeClass
	public void setup() throws FileNotFoundException, InterruptedException {
		initialization();
		loginpage=new LoginPageMyntra();
		homepage=loginpage.verify_login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void mentshirt() {
		tshirt=homepage.men_cat();
	}

}
