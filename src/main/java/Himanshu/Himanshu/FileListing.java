package Himanshu.Himanshu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileListing extends ReadingProperties {

	static WebDriver driver = null;
	static FilrAngularUI_PageObject fw = null;
	 Properties prop = null;
	 
	public static void main(String[] args) throws  IOException{
		
		FileListing fl = new FileListing();
		
		//Passing URL for launching new Browser
	
	BrowserLaunch("chrome", "https://blr8-110-205.apac.novell.com");
	
	try {
		MyFilesFolder(fl);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static void BrowserLaunch(String BrowserName,String url)
	{
		if(BrowserName=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
	}
	
	public static void MyFilesFolder(FileListing fl) throws InterruptedException, IOException
	{
		fw = new FilrAngularUI_PageObject(driver);
		Thread.sleep(10000);
		fl.ReadingFromProperties();
		fw.loginUsername().sendKeys(fl.UserName);
		fw.loginPassword().sendKeys(fl.Password);
		
	}

	
}
