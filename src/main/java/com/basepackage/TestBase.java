package com.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import com.test.util.testutil;

public class TestBase {
	public static WebDriver driver;

    public static Properties prop;
    
    public static WebDriverWait wait;
    
    
    public TestBase() throws FileNotFoundException{
    	
    	prop=new Properties();
    	
    	FileInputStream file=new FileInputStream("C:\\Users\\Aniket\\eclipse-workspace\\maven-demo\\src\\main\\java\\com\\config\\properties\\OR1.properties");
    	
        try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }   
    
    
    public void initialization()
    {
    	String browsername=prop.getProperty("browser");
    	if(browsername.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	
    	else
    	{
    		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
    		driver=new InternetExplorerDriver();
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(testutil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
    	
    	driver.get(prop.getProperty("url"));
   	
    }
        
        
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
	


