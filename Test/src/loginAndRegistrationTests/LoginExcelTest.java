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
import utility.ExcelUtils;

public class LoginExcelTest extends commonTest
{
	@DataProvider(name="Authentication")
	  public Object[][] loginData() throws Exception
	  {
	       Object[][] testObjArray = ExcelUtils.getDataFromExcel("src//testData//LoginData.xlsx","Sheet2");
	       return (testObjArray);
	  }
	@Test(dataProvider="Authentication")
	public void UserLogin(String username, String password)
	{
		//loginPage.Goto();
		loginPage.loginAs(username)
			.withPassword(password)
			.login();
		Assert.assertEquals(loggedInCheck.isAt(), true, "Login failed");//actual,expected
	}
  
  
}
