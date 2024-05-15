package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;

public class ActiTIME_LeaveTypesPage extends FatchingData
{

	//declaration
	
	@FindBy(xpath="//button[contains(.,'New Type')]")
	private WebElement NewLeaveTypeButton;
	
	@FindBy (xpath="//input[@placeholder='Enter name']")
	private WebElement CreateLeaveNameTextfiled;
	
	@FindBy (xpath="//span[text()='Default Leave Rate = Regular User Rate']/../..//input[@type='text']")
	private WebElement LeaveHourRateTextfiled;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement AffectedBalaceCheckbox;
	
	@FindBy (xpath="//button[text()='PTO Balance']")
	private WebElement AffectedBalaceDropdown;
	
	@FindBy (xpath="//div[@class='components-SimpleSelect-SimpleSelectItem-item--uM4beWsH']")
	private List<WebElement> AffectedBalaceDropdownOptions;
	
	@FindBy (xpath="//span[text()='Save']")
	private WebElement LeaveTypeSavebutton;
	
	@FindBy (xpath="(//span[.='Arishman']/../../../../..)[1]//div[@data-for='itemListPageTooltip']/..")
	private WebElement LeaveTypeName;
	
	@FindBy (xpath="//span[contains(.,'Delete')]")
	private WebElement LeaveTypeDeleteButton;
	
	@FindBy (xpath="//button[contains(.,'OK, Delete')]")
	private WebElement LeaveTypeDeleteOkButton;
	
	//initialization
	
	public ActiTIME_LeaveTypesPage(WebDriver driver) 
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void createLeaveType() throws Throwable
	{
		js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		NewLeaveTypeButton.click();
		Thread.sleep(2000);
		CreateLeaveNameTextfiled.sendKeys("Arishman");
		LeaveHourRateTextfiled.clear();
		LeaveHourRateTextfiled.sendKeys("5");
		js.executeScript("arguments[0].click()", AffectedBalaceCheckbox);
		AffectedBalaceDropdown.click();
		for (WebElement options : AffectedBalaceDropdownOptions) 
		{
			String text = options.getText();
			System.out.println(text);
			if(text.contains("Sick Days Balance"))
			{
				options.click();
				break;
			}
		}
		LeaveTypeSavebutton.click();
	}
	public void deleteLeaveType() throws Throwable
	{
		LeaveTypeName.click();
		Thread.sleep(2000);
		LeaveTypeDeleteButton.click();
		Thread.sleep(1000);
		LeaveTypeDeleteOkButton.click();
	}
}
