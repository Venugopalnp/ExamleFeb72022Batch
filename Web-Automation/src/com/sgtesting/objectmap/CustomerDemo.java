package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerDemo {
	
	public static WebDriver oBrowser=null;
	public static ObjectMap objectmap=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		String filename=null;
		try
		{
			filename="D:\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "D:\\JavaAutomation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customerpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpageaddnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpagenewcustomer")).click();
			oBrowser.findElement(objectmap.getLocator("customerpageentername")).sendKeys("Customer1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpagecreate")).click();
			Thread.sleep(4000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customerpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpageeditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpageaction")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpagedelete")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpagedeletepermanently")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customerpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpageeditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpagedescription")).sendKeys("customer details");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerpageeditclose")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
