package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;
import Utils.FatchingData;
import Utils.Helper;

public class ActitimeSettingsPage extends FatchingData
{

	@FindBy (xpath = "//li[@class='popup_menu_item']")
	private List<WebElement> optionsInSettings;


	public ActitimeSettingsPage(WebDriver driver)
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void alloptionsText() throws Throwable
	{
		System.out.println(optionsInSettings.size());
		for(WebElement newoptions:optionsInSettings)
		{
			Thread.sleep(2000);
			System.out.println(newoptions.getText());
		}
	}

	public void typesofWork() throws Throwable

	{
		for(WebElement newoptions:optionsInSettings)
		{
			Thread.sleep(2000);
			System.out.println(newoptions.getText());
			if(newoptions.getText().equals("Types of Work"))
			{
				Helper.heighlightElements(driver, newoptions);
				newoptions.click();
				break;
			}
		}
	}
	public void Leave() throws Throwable

	{
		for(WebElement newoptions:optionsInSettings)
		{
			Thread.sleep(2000);
			System.out.println(newoptions.getText());
			if(newoptions.getText().equals("Leave Types"))
			{
				Helper.heighlightElements(driver, newoptions);
				newoptions.click();
				break;
			}
		}
	}

}
