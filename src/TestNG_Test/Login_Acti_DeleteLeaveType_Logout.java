package TestNG_Test;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Login_Acti_DeleteLeaveType_Logout extends BaseTest
{
	@Test
	public void leaveType() throws Throwable
	{
		home.setting();
		setting.Leave();
		leaveType.deleteLeaveType();
	}
}
