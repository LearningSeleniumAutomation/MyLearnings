package Himanshu.Himanshu;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class WindowsHandleCommands {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.google.com");
			String WindowsID = driver.getWindowHandle();
			System.out.println("Windows Handle is: "+WindowsID);
			
			

		
		}
		
		
	}


