/*
 * @author Anjali
 * @since   2016-05-31
 */
package pageElements;

import org.openqa.selenium.By;

public class pageObjRef 
{
	public static By loginButton = By.xpath(".//*[@id='dokuwiki__usertools']/ul/li/a");
	public static By username = By.xpath(".//*[@id='focus__this']");
	public static By password = By.xpath(".//*[@id='dw__login']/div/fieldset/label[2]/input");
	public static By loginClick = By.xpath(".//*[@id='dw__login']/div/fieldset/button");

}
