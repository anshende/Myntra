package com.testpackage;

import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import com.basepackage.TestBase;



public class zooplaTest extends TestBase{

	public zooplaTest() throws FileNotFoundException {
		super();
		
	}
	
	@BeforeClass
	public void setup() throws FileNotFoundException, InterruptedException {
		initialization();
	}
	
	public void logo() {
		
		WebElement logo_zoopla=driver.findElement(By.id("logo"));
		Boolean status=logo_zoopla.isDisplayed();
		System.out.println(status);
	}
	
	public void searchbox() {
		
		WebElement search_box=driver.findElement(By.id("search-input-location"));
		search_box.sendKeys("London");
		
		WebElement search=driver.findElement(By.id("search-submit"));
		search.submit();
		
	}
	
	public void price() {
		
		List<WebElement> prices=driver.findElements(By.xpath("listing-results-price text-price"));
		
		for(int i=0;i<=prices.size();i++)
		{
			
		    System.out.println(prices.get(i).getText());
			
		}
		
		String propertyvalue=prices.get(4).getText();
		System.out.println(propertyvalue);
		
		
	}

}
