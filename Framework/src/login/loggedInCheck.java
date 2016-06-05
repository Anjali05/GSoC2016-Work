/*
 * @author Anjali
 * @since   2016-05-31
 */
package login;

import org.openqa.selenium.WebElement;

import pageElements.pageObjRef;
import webDriver.driver;

public class loggedInCheck 
{

	public static boolean isAt() 
	{
		// TODO Auto-generated method stub
		WebElement logout = driver.Instance.findElement(pageObjRef.Logout);
		String title = logout.getText();
		if(title.equals("Log Out"))
		    return true;
		else
			return false;
	}

}
