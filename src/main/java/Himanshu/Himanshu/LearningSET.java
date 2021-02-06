package Himanshu.Himanshu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSET {

	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
	Set<String> values = new HashSet<String>();
	values.add("himanshu");
	values.add("swati");
	getSetofBrowserID(values, "test");
	System.out.println("test");
		
	}

	
	public static void getSetofBrowserID(Set<String> windowsID, String ParentID)
	{
		//windowsID = new HashSet<String>();
		
	
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			String ID = it.next();
		//	System.out.println(ID);
			if(ID!=ParentID)
			{
				System.out.println(ID);
				//driver.switchTo().window(ID);
				//String ChildWindowURL = driver.getCurrentUrl();
				//System.out.println(ChildWindowURL);
			}
		}
	}
	}

