package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;
import Utils.Helper;

public class ActiTIME_TaskListPage extends FatchingData
{
	//declaration
	
	@FindBy (xpath="//div[@class='addNewButton']")
	private WebElement AddNewButton;
	
	@FindBy (xpath="//div[@class='item createNewCustomer']")
	private WebElement AddNewCustomerButton;
	
	@FindBy (xpath="//div[@class='item createNewProject']")
	private WebElement AddNewProjectButton;
	
	@FindBy (xpath="//div[@class='item createNewTasks']")
	private WebElement AddNewTaskButton;
	
	@FindBy (xpath="//div[@class='item importTasks']")
	private WebElement importTasksButton;
	
	@FindBy (xpath = "(//input[@placeholder=\"Start typing name ...\"]/../..)[1]")
	private WebElement SearchTextField;
	@FindBy (xpath = "//div[@class='node customerNode editable selected']")
	private WebElement customer;
	
	@FindBy (xpath="//span[.='Qspiders']/../../..//div[@class='editButton']")
	private WebElement customerSettingButton;
	
	@FindBy (xpath="(//div[.='ACTIONS'])[1]/..")
	private WebElement customerActionButton;
	
	@FindBy (xpath="(//div[@class='deleteButton'])[1]")
	private WebElement customerDeleteButton;
	
	@FindBy (xpath="//span[.='Delete permanently']/../..")
	private WebElement DeletePermanentlyButton;
	
	
	
	//Initialization
	
	public ActiTIME_TaskListPage(WebDriver driver) 
	{
		Base.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void addNewCutsomer() throws Throwable
	{
		Helper.heighlightElements(driver, AddNewButton);
		AddNewButton.click();
		Thread.sleep(1000);
		Helper.heighlightElements(driver, AddNewCustomerButton);
		AddNewCustomerButton.click();
	}
	
	public void deleteCustomer() throws Throwable
	{
		js =(JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		Helper.heighlightElements(driver, SearchTextField);
		actions.sendKeys(SearchTextField, "QSPIDERS").perform();
		Thread.sleep(2000);
		Helper.heighlightElements(driver, customer);
		actions.moveToElement(customer).perform();
		Thread.sleep(2000);
		Helper.heighlightElements(driver, customer);
		js.executeScript("arguments[0].click()", customer);
		Thread.sleep(2000);
		Helper.heighlightElements(driver, customerSettingButton);
		js.executeScript("arguments[0].click()", customerSettingButton);
		Thread.sleep(2000);
		Helper.heighlightElements(driver, customerActionButton);
		actions.click(customerActionButton).perform();
		Thread.sleep(2000);
		Helper.heighlightElements(driver, customerDeleteButton);
		actions.click(customerDeleteButton).perform();
		Thread.sleep(2000);
		Helper.heighlightElements(driver, DeletePermanentlyButton);
		actions.click(DeletePermanentlyButton).perform();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}
