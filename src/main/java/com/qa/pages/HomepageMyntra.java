package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepackage.TestBase;

public class HomepageMyntra extends TestBase {
	
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='desktop-navLinks']/div[1]")
	WebElement men;
	
	@FindBy(xpath="//ul[@class='desktop-navBlock']/li[2]/a[@href='https://www.myntra.com/men-tshirts']")
	WebElement men_tshirt;
	
	
	
	public HomepageMyntra() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public TshirtpageMyntra men_cat() {
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		wait.until(ExpectedConditions.elementToBeClickable(men_tshirt)).click();
		
		return new TshirtpageMyntra();
	}
   
	
}
