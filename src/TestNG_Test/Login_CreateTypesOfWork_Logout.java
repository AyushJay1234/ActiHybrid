package TestNG_Test;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Login_CreateTypesOfWork_Logout extends BaseTest
{
	@Test
	public void  CreateTypesOfWork() throws Throwable
	{
		home.setting();
		setting.typesofWork();
		typesOfWork.createtypeofwork();
	}

}
