/*
 * @author Anjali
 * @since   2016-05-31 
 */
package loginAndRegistrationTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseTests.commonTest;
import login.loggedInCheck;
import login.loginPage;

public class LoginDataProviderTest extends commonTest
{
	@DataProvider(name = "Authentication")
	public static Object[][] credentials()
	{
		return new Object[][]{{"dummy1","dummy1"},{"dummyUsername","dummy_password"}};
	}
	@Test(dataProvider="Authentication")
	public void canUserLogin(String username, String password)
	{
		//loginPage.Goto();
		loginPage.loginAs(username)
			.withPassword(password)
			.login();
		Assert.assertEquals(loggedInCheck.isAt(), true, "Login failed");//actual,expected
	}
}
