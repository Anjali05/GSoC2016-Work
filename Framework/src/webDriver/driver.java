/*
 * @author Anjali
 * @since   2016-05-33 
 */
package webDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver 
{
	public static WebDriver Instance;
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GSoC Workspace\\ChromeDriver\\chromedriver.exe");
		Instance= new ChromeDriver();
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Instance.get("http://systers.org/systers-dev/doku.php");
	}
	
	public static void closeDriver()throws IOException 
	{
		Instance.close();
	}
}
