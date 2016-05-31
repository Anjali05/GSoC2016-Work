/*
 * @author Anjali
 * @since   2016-05-30 
 */
package baseTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webDriver.driver;

public class commonTest 
{
	@BeforeMethod//(alwaysRun = true)
	public void startDriver()
	{
		driver.initialize();
	}
	
	@AfterMethod//(alwaysRun = true)
	public void tearDown () 
	{
		try
		{
			driver.closeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
