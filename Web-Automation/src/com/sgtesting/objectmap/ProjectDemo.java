package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectDemo {

	public static WebDriver oBrowser=null;
	public static ObjectMap objectmap=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createProject();
	//	modifyProject();
	//	deleteProject();
	//	logout();
	//	closeApplication();

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
	
	private static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projectpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageaddnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpagenewproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageprojectname")).sendKeys("UserProject");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageselectcustomer")).click();
			Thread.sleep(2000);
			//oBrowser.findElement(objectmap.getLocator("projectpagecustomername")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpagecreateproject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projectpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageeditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageenterdescription")).sendKeys("User Details");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageeditclose")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projectpageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageeditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpageaction")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpagedelete")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectpagedeletepermanently")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
