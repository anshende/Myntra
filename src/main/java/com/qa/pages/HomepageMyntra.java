package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepackage.TestBase;

public class HomepageMyntra extends TestBase {
	
	
	@FindBy(xpath="//div[@class='desktop-navLinks']/div[1]")
	WebElement men;
	
	public HomepageMyntra() throws FileNotFoundException {
		super();
	}

}
