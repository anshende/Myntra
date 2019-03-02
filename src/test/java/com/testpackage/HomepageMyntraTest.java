package com.testpackage;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basepackage.Takescreenshot;
import com.basepackage.TestBase;
import com.qa.pages.HomepageMyntra;
import com.qa.pages.LoginPageMyntra;
import com.qa.pages.TshirtpageMyntra;


@Listeners(Takescreenshot.class)
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
		Thread.sleep(4000);
		homepage=new HomepageMyntra();
		homepage=loginpage.verify_login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(4000);
		
	}
	
	
	@Test
	public void verify_title() {
		String title=homepage.homepagetitle();
		Assert.assertEquals(title, "Men T-shirts - Buy T-shirt for Men Online in India | Myntra");	
	}
	
	@Test
	public void mentshirt() throws InterruptedException {
		tshirt=homepage.men_cat();
	}

}
