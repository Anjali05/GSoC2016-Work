/*
 * @author Anjali
 * @since   2016-05-33 
 */
package webDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Logs.log4j;

public class driver 
{
	public static WebDriver Instance;
	//public static Logger Log = Logger.getLogger(driver.class.getName());
	public static void initialize()
	{
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver", "D:\\GSoC Workspace\\ChromeDriver\\chromedriver.exe");
		Instance= new ChromeDriver();
		log4j.Log.info("driver started");
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Instance.get("http://systers.org/systers-dev/doku.php");
	}
	
	public static void closeDriver()throws IOException 
	{
		log4j.Log.info("driver closed");
		Instance.close();
	}
}
