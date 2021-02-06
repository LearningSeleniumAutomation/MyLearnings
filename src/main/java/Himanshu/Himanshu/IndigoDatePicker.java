package Himanshu.Himanshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
	
		//By locator
		
		By datePickerTable = By.xpath("//input[@type='text' and @class='form-control or-depart igInitCalendar focus']");	
		
		//get the webElements
		By CurrentVisiblemonthAndYear = By.xpath("//div[@class='ui-datepicker-title']/span");
		
		//getting all the Dates in first group
		//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']//td/a
		
		
	}

}
