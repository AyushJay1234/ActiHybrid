package TestNG_Test;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Login_Acti_DeleteCustomer_Logout extends BaseTest
{
	@Test
	public void deleteCustomer() throws Throwable
	{
		home.task();
		taskPage.deleteCustomer();
	}

}
