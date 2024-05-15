package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;
import Utils.Helper;

public class ActiTIME_TypesOfWorkPage extends FatchingData
{
	//declaration
	
	@FindBy (xpath = "//button[contains(.,'New Type')]")
	private WebElement NewTypeOfWorkButton;
	
	@FindBy (xpath = "//input[@id='title']")
	private WebElement CreateworkNameTextfiled;
	
	@FindBy (xpath = "//button[contains(.,'Save')]")
	private WebElement CreateworkSaveButton;
	
	@FindBy (xpath = "//span[contains(@class,'containers-TypesOfWorkItemList-itemName')]")
	private List<WebElement> NewWork;
	
	@FindBy (xpath = "//span[contains(.,'QSPIDERS')]/../../..//label//span")
	private WebElement SelectCheckbox;
	
	@FindBy (xpath = "//div[text()='Delete']")
	private WebElement DeleteButtonOfCreatedWork;
	
	@FindBy (xpath = "//button[text()='OK, Delete']")
	private WebElement DeleteOkButtonOfCreatedWork;
	//initialization
	
	public ActiTIME_TypesOfWorkPage(WebDriver driver) 
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void createtypeofwork() throws Throwable
	{
		Helper.heighlightElements(driver, NewTypeOfWorkButton);
		NewTypeOfWorkButton.click();
		Thread.sleep(2000);
		Helper.heighlightElements(driver, CreateworkNameTextfiled);
		CreateworkNameTextfiled.sendKeys(data.GetPropertyName("CreateNewTypesOfWork"));
		Thread.sleep(2000);
		Helper.heighlightElements(driver, CreateworkSaveButton);
		CreateworkSaveButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	public void deletetypesofwork() throws Throwable
	{
		for (WebElement workname : NewWork) 
		{
			String text = workname.getText();
			if(text.contains(data.GetPropertyName("CreateNewTypesOfWork")))
			{
				SelectCheckbox.click();
				Thread.sleep(2000);
				DeleteButtonOfCreatedWork.click();
				Thread.sleep(2000);
				DeleteOkButtonOfCreatedWork.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		}
	}
}
