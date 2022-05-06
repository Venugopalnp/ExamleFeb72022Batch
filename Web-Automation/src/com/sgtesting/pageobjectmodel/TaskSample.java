package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSample {
	public static WebDriver oBrowser=null;
	public static UserSample1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTasks();
	//	deleteTasks();
	//	deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new UserSample1(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oPage.Customer().click();
			Thread.sleep(2000);
			oPage.AddCustomer().click();
			Thread.sleep(2000);
			oPage.TypeName().click();
			Thread.sleep(2000);
			oPage.cusNambox().sendKeys("DemoUser1");
			Thread.sleep(2000);
			oPage.clicok().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.Customer().click();
			Thread.sleep(2000);
			oPage.AddCustomer().click();
			Thread.sleep(2000);
			oPage.newProject().click();
			Thread.sleep(2000);
			oPage.projectNameField().sendKeys("SampleUser");
			Thread.sleep(2000);
			oPage.createProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTasks()
	{
		try
		{
			oPage.addNewtasks().click();
			Thread.sleep(2000);
			oPage.creNewtasks().click();
			Thread.sleep(2000);
			oPage.enterdetails().sendKeys("Manual");
			Thread.sleep(2000);
			oPage.createtask().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTasks()
	{
		try
		{
			oPage.selecttask().click();
			Thread.sleep(2000);
			oPage.deleetask().click();
			Thread.sleep(2000);
			oPage.deletebuttontask().click();
			Thread.sleep(2000);
			oPage.confirmtask().click();
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
			oPage.selectProject().click();
			Thread.sleep(2000);
			oPage.settingProject().click();
			Thread.sleep(2000);
			oPage.actionProject().click();
			Thread.sleep(2000);
			oPage.deleteProject().click();
			Thread.sleep(2000);
			oPage.confirmProject().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.SelectCustomer().click();
			Thread.sleep(2000);
			oPage.SelectSetting().click();
			Thread.sleep(2000);
			oPage.goAction().click();
			Thread.sleep(2000);
			oPage.DeleteCustomer().click();
			Thread.sleep(2000);
			oPage.deleteConfirm().click();
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
			oPage.getLogoutLink().click();
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


}

