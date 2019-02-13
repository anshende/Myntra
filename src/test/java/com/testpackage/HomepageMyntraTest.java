package com.testpackage;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basepackage.TestBase;
import com.qa.pages.HomepageMyntra;
import com.qa.pages.TshirtpageMyntra;

public class HomepageMyntraTest extends TestBase {
	
	HomepageMyntra homepage;
	TshirtpageMyntra tshirt;
	
	public HomepageMyntraTest() throws FileNotFoundException {
	    super();
	}
	
	@BeforeClass
	public void setup() throws FileNotFoundException {
		initialization();
		homepage=new HomepageMyntra();
	}
	
	@Test
	public void mentshirt() {
		tshirt=homepage.men_cat();
	}

}
