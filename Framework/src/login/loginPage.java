/*
 * @author Anjali
 * @since   2016-05-31
 */
package login;

import webDriver.driver;

public class loginPage 
{

	public static void Goto() 
	{
		// TODO Auto-generated method stub
		//driver.Instance.get("http://google.com");
		
	}

	public static loginCommand loginAs(String username) 
	{
		// TODO Auto-generated method stub
		return new loginCommand(username);
	}

}
