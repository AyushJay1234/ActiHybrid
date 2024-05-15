package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;

public class ActiTIME_CreateNewCustomerPage extends FatchingData
{
	//declaration
	@FindBy (xpath="//div[@class='customerInfoDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement CustomerNameTextfiled;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescriptionTextare;
	
	@FindBy (xpath="//div[@class='emptySelection']")
	private WebElement SelectCustomerDropdown;
	
	@FindBy (xpath="//div[contains(@class,'itemRow')]")
	private List<WebElement> SelectCustomerDropdownOptions;
	
	@FindBy (xpath="//div[contains(@class,'commitButtonPlaceHolder')]")
	private WebElement CreateCustomerSaveButton;
	
	@FindBy (xpath="//div[contains(@class,'greyButton cancelBtn')]")
	private WebElement CreateCustomerCancelButton;
	
	//initialization
	public ActiTIME_CreateNewCustomerPage(WebDriver driver) 
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void CreateCustomer() throws Throwable
	{
		CustomerNameTextfiled.sendKeys(data.GetPropertyName("CreateNewCustomer"));
		CustomerDescriptionTextare.sendKeys("good person");
		SelectCustomerDropdown.click();
		Thread.sleep(2000);
		for (WebElement NewOption : SelectCustomerDropdownOptions) 
		{
			String text = NewOption.getText();
			System.out.println(text);
			if (text.equals("Big Bang Company")) 
			{
				NewOption.click();
				break;
			}
		}
		Thread.sleep(1000);
		CreateCustomerSaveButton.click();
	}
}
