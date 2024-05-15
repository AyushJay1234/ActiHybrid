package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import POM.ActiTIME_CreateNewCustomerPage;
import POM.ActiTIME_LeaveTypesPage;
import POM.ActiTIME_TaskListPage;
import POM.ActiTIME_TypesOfWorkPage;
import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;
import POM.ActitimeSettingsPage;

public class Base
{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static ActitimeLoginPage login;
	public static ActitimeHomePage home;
	public static ActitimeSettingsPage setting;
	public static ActiTIME_TypesOfWorkPage typesOfWork;
	public static ActiTIME_TaskListPage taskPage;
	public static ActiTIME_CreateNewCustomerPage CreateCustomer;
	public static ActiTIME_LeaveTypesPage leaveType ;
	public static FatchingData data ;
	public static void obj()
	{
		login = new ActitimeLoginPage(driver);
		home = new ActitimeHomePage(driver);
		setting = new ActitimeSettingsPage(driver);
		typesOfWork = new ActiTIME_TypesOfWorkPage(driver);
		taskPage = new ActiTIME_TaskListPage(driver);
		leaveType = new ActiTIME_LeaveTypesPage(driver);
		CreateCustomer = new ActiTIME_CreateNewCustomerPage(driver);
		data = new FatchingData();
	}
	
	
}
