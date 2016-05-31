/*
 * @author Anjali
 * @since   2016-05-31
 */
package login;
import org.openqa.selenium.WebElement;
import pageElements.pageObjRef;
import webDriver.driver;

public class loginCommand 
{
	private String username;
	private String password;
	public loginCommand(String username)
	{
		this.username = username;
	}

	public loginCommand withPassword(String password) 
	{
		this.password = password;
		return this;
	}

	public void login() 
	{
		// TODO Auto-generated method stub
		WebElement loginButton = driver.Instance.findElement(pageObjRef.loginButton);
		loginButton.click();
		WebElement usrname = driver.Instance.findElement(pageObjRef.username);
		WebElement pasword = driver.Instance.findElement(pageObjRef.password);
		usrname.clear();
		pasword.clear();
		usrname.sendKeys(username);
		pasword.sendKeys(password);
		WebElement loginClick = driver.Instance.findElement(pageObjRef.loginClick);
		loginClick.click();
		
	}
}
