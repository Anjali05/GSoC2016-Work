/*
 * @author Anjali
 * @since   2016-05-31 
 */
package loginAndRegistrationTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Logs.log4j;
import baseTests.commonTest;
import login.loggedInCheck;
import login.loginPage;

public class LoginDataProviderTest extends commonTest
{
	@DataProvider(name = "Authentication")
	public static Object[][] credentials()
	{
		return new Object[][]{{"anjalis","anjali05"},{"dummyUsername","dummy_password"}};
	}
	
	@Test(dataProvider="Authentication")
	public void canUserLogin(String username, String password)
	{
		//loginPage.Goto();
		loginPage.loginAs(username)
			.withPassword(password)
			.login();
		Assert.assertEquals(loggedInCheck.isAt(), true, "Login failed");//actual,expected
		log4j.Log.info("Test passed");
	}
}
