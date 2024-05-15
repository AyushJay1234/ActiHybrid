package TestNG_Test;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Login_Acti_CreateCustomer_Logout extends BaseTest
{
	@Test
	public void CreateCustomer() throws Throwable
	{
		home.task();
		taskPage.addNewCutsomer();
		CreateCustomer.CreateCustomer();
	}
}
