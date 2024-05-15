package TestNG_Test;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Login_Acti_DeleteTypesOfWork_Logout extends BaseTest
{
	@Test
	public void DeleteTypesOfWork() throws Throwable
	{
		home.setting();
		setting.typesofWork();
		typesOfWork.deletetypesofwork();
	}

}
