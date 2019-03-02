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
	
	
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[@href='/shop/men']")
	WebElement men;
	
	@FindBy(xpath="//a[@href='/men-tshirts']")
	WebElement men_tshirt;
	
	
	
	public HomepageMyntra() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String homepagetitle() {
		return driver.getTitle();
	}
	
	public TshirtpageMyntra men_cat() throws InterruptedException {
		Thread.sleep(4000);
		wait=new WebDriverWait(driver,20);
		Actions action=new Actions(driver);
		action.moveToElement(men).build().perform();
		//action.click(men_tshirt);
	     wait.until(ExpectedConditions.visibilityOf(men_tshirt)).click();
		//men_tshirt.click();
		Thread.sleep(5000);
		return new TshirtpageMyntra();
	}
   
	
}
