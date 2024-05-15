package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.Base;
import Utils.FatchingData;
import Utils.Helper;

public class ActitimeHomePage extends FatchingData
{

	@FindBy (xpath = "(//a[@id='logoutLink'])[1]")
	private WebElement logoutLink;
	
	@FindBy (xpath = "//div[contains(@class,'settings')]")
	private WebElement settings;
	
	@FindBy (xpath = "//div[@id='container_tasks']/../..")
	private WebElement taskButton;
	
	public ActitimeHomePage(WebDriver driver)
	{
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setting() throws Throwable
	{
		Thread.sleep(3000);
		Helper.heighlightElements(driver, settings);
		settings.click();
	}
	
	public void task() throws Throwable
	{
		Thread.sleep(2000);
		Helper.heighlightElements(driver, taskButton);
		taskButton.click();
	}
	
	public void teardown() throws Throwable
	{
		Thread.sleep(2000);
		Helper.heighlightElements(driver, logoutLink);
		logoutLink.click();
		Thread.sleep(7000);
		driver.quit();
	}

}
