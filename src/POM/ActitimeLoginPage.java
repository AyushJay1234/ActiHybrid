package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;
import Utils.Helper;

public class ActitimeLoginPage extends FatchingData
{
	//Deceleration
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameTextfield;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	private WebElement passwordTextfield;
	
	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement LoginButton;
	
	@FindBy (xpath = "//a[.='Forgot your password?']")
	private WebElement Forgotlink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement inclink;
	//Initilization
	public ActitimeLoginPage(WebDriver driver)
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void login() throws Throwable
	{
		Helper.heighlightElements(driver, usernameTextfield);
		usernameTextfield.sendKeys(username);
		Helper.heighlightElements(driver, passwordTextfield);
		passwordTextfield.sendKeys(password);
		js = (JavascriptExecutor)driver;
		if(checkBox.isDisplayed())
		{
			Helper.heighlightElements(driver, checkBox);
			js.executeScript("arguments[0].click()",checkBox);
			Thread.sleep(2000);
			System.out.println("Check Box Is Selected" + checkBox.isSelected());
		}
		else 
		{
			System.out.println("Check box is not Present");
		}
		
		js.executeScript("arguments[0].click()",LoginButton);
	
	}
	
	public void forgotpassword() throws Throwable
	{
		Helper.heighlightElements(driver, Forgotlink);
		js.executeScript("arguments[0].click()",Forgotlink);
	}
	
	public void inc() throws Throwable
	{
		Helper.heighlightElements(driver, inclink);
		js.executeScript("arguments[0].click()",inclink);
	}


}
