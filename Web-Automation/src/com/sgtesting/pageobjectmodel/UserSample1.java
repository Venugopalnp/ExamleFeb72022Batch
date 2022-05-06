package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Here ActiTime is UserSample1

public class UserSample1 {

	public UserSample1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Login Page, User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Login Page, Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login Page, Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Home Page, Flyout Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Home Page, Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}

	//Homepage, User
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement oUser;
	public WebElement getUserPage()
	{
		return oUser;
	}

	//Homepage addUser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;
	public WebElement getUser()
	{
		return addUser;
	}

	//Userpage firstname
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}

	//userpage lastname
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName;
	}

	//userpage email
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}

	//userpage user
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserName1()
	{
		return userDataLightBox_usernameField;
	}

	//userpage password
	private WebElement userDataLightBox_passwordField;
	public WebElement getPassword1()
	{
		return userDataLightBox_passwordField;
	}

	//userpage passwordcopy
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getPasswordCopy1()
	{
		return userDataLightBox_passwordCopyField;
	}

	//userpage create
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CreateUser1;
	public WebElement getCreateUser1()
	{
		return CreateUser1;
	}

	//user modify
	@FindBy(xpath = "//span [text()='user, Demo']")
	private WebElement modifyUser;
	public WebElement Modifyusers()
	{
		return modifyUser;
	}

	//to save Edited one of user
	@FindBy(xpath ="//span [text()='Save Changes']" )
	private WebElement Savechanges;
	public WebElement savechanges()
	{
		return Savechanges;
	}

	//to delete user
	@FindBy(xpath = "//span [text()='User1, User1']")
	private WebElement oclick;
	public WebElement Click() 
	{
		return oclick;
	}

	//delete click
	@FindBy(id  = "userDataLightBox_deleteBtn")
	private WebElement deleteclick;
	public WebElement delClick() 
	{
		return deleteclick;
	}


	// to Create Customer
	@FindBy(xpath = "//div [text()='TASKS']")
	private WebElement creCusto;
	public WebElement Customer()
	{
		return creCusto;
	}
	
	@FindBy(xpath = "//div [text()='Add New']")
	private WebElement addNewCus;
	public WebElement AddCustomer()
	{
		return addNewCus;
	}

	@FindBy(xpath = "//html/body/div[14]/div[1]" )
	private WebElement typName;
	public WebElement TypeName()
	{
		return typName;
	}

	@FindBy(id = "customerLightBox_nameField")
	private WebElement cusNamebox;
	public WebElement cusNambox()
	{
		return  cusNamebox;
	}

	@FindBy(xpath = "//span [text()='Create Customer']" )
	private WebElement clickok;
	public WebElement clicok()
	{
		return clickok;
	}

	//to del Customer
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
	private WebElement  selcus;
	public WebElement SelectCustomer()
	{
		return selcus;
	}
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]" )
	private WebElement selset;
	public WebElement SelectSetting()
	{
		return selset;
	}
	@FindBy(xpath = "//div [text()='ACTIONS']" )
	private WebElement goact;
	public WebElement goAction()
	{
		return goact;
	}
	@FindBy(xpath = "//div [text()='Delete']" )
	private WebElement delcus;
	public WebElement DeleteCustomer()
	{
		return delcus;
	}
	@FindBy(id = "customerPanel_deleteConfirm_submitTitle" )
	private WebElement condel;
	public WebElement deleteConfirm()
	{
		return condel;
	}

	//ModifyCustomer
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]" )
	private WebElement SelCusto;
	public WebElement SelectcustomertoModify()
	{
		return SelCusto;
	}
	@FindBy(xpath  = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]" )
	private WebElement custoset;
	public WebElement Customersetting()
	{
		return custoset;
	}
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea" )
	private WebElement descCus;
	public WebElement DesCustomerWindow()
	{
		return descCus;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]" )
	private WebElement clowin;
	public WebElement closeCustomerWindow()
	{
		return clowin;
	}

	//create project
	@FindBy(xpath = "//div [text()='+ New Project']")
	private WebElement nwpojct;
	public WebElement newProject()
	{
		return nwpojct;
	}

	@FindBy(id = "projectPopup_projectNameField")
	private WebElement nameField;
	public WebElement projectNameField()
	{
		return nameField;
	}

	@FindBy(xpath = "//span [text()='Create Project']")
	private WebElement crepro;
	public WebElement createProject()
	{
		return crepro;
	}

	//To Del Project

	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement selpro;
	public WebElement selectProject()
	{
		return selpro;
	}

	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement setpro;
	public WebElement settingProject()
	{
		return setpro;
	}

	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actpro;
	public WebElement actionProject()
	{
		return actpro;
	}

	@FindBy(xpath = "//*[@id=\\\"taskListBlock\\\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement delpro;
	public WebElement deleteProject()
	{
		return delpro;
	}

	@FindBy(id = "projectPanel_deleteConfirm_submitTitle")
	private WebElement conpro;
	public WebElement confirmProject()
	{
		return conpro;
	}

	//select project to modify
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement sellpro;
	public WebElement selectProject1()
	{
		return sellpro;
	}

	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement settpro;
	public WebElement settingProject1()
	{
		return settpro;
	}
	@FindBy(xpath= "//*[//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]")
	private WebElement detpro;
	public WebElement Detailproject()
	{
		return detpro;
	}

	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement closepro;
	public WebElement closeProject()
	{
		return closepro;
	}
	// to create tasks
	@FindBy(xpath="//div [text()='Add New Task']")
	private WebElement addNwtak;
	public WebElement addNewtasks()
	{
		return addNwtak;
	}

	@FindBy(xpath="//div [text()='Create new tasks']")
	private WebElement crenwtk;
	public WebElement creNewtasks()
	{
		return crenwtk;
	}

	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement enterdet;
	public WebElement enterdetails()
	{
		return enterdet;
	}

	@FindBy(xpath="//span [text()='Create Tasks']")
	private WebElement cretask;
	public WebElement createtask()
	{
		return cretask;
	}
	//task delete 
	@FindBy(xpath="//div [text()='Manual']")
	private WebElement seltas;
	public WebElement selecttask()
	{
		return seltas;
	}

	@FindBy(xpath="//*[@id=\\\"taskListBlock\\\"]/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement deletask;
	public WebElement deleetask()
	{
		return deletask;
	}

	@FindBy(xpath="//*[@id=\\\"taskListBlock\\\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement delebuttask;
	public WebElement deletebuttontask()
	{
		return delebuttask;
	}

	@FindBy(id="taskPanel_deleteConfirm_submitTitle")
	private WebElement contak;
	public WebElement confirmtask()
	{
		return contak;
	}

}

