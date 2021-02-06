package Himanshu.Himanshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url = "http://demo.guru99.com/test/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		//By Locators for calender
		
		By calenderShow = By.xpath("//input[@type='datetime-local']");
		
		driver.findElement(calenderShow).click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
