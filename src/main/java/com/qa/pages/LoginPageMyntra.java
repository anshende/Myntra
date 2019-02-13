package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestBase;

public class LoginPageMyntra extends TestBase{
	
	@FindBy(className="desktop-user")
	WebElement user;
	
	@FindBy(xpath="/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[2]/div[2]/div[2]/a[2]")
	WebElement login;
	
	@FindBy(name="email")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className="login-login-button")
	WebElement loginbutton;
	
	public LoginPageMyntra() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verify_title() {
		
		return driver.getTitle();
		
	}
	
	public HomepageMyntra verify_login(String username, String pwd) throws InterruptedException, FileNotFoundException {
		
		user.click();
		login.click();
		userid.sendKeys(username);
		password.sendKeys(pwd);
		
		Thread.sleep(10000);
		
		loginbutton.click();
		
		
		return new HomepageMyntra();
		
	}
}
