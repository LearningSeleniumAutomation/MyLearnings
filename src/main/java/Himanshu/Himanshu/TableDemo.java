package Himanshu.Himanshu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "http://demo.guru99.com/test/table.html";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		//By Locators for the table 
		
		By table = By.xpath("//tbody//td");
		By table1 = By.xpath("//tbody//tr/td");
		
		//Reading column 1
		By table2 = By.xpath("//tbody//tr/td[1]");
		By table3 = By.xpath("//tbody//td[1]");
		
		//Reading Row by Row or Row 1
		By table4 = By.xpath("//tbody/tr[1]");
		
		
		
		
		List<WebElement> tableContains=driver.findElements(table);
		System.out.println("Size of the the table is: --> " +tableContains.size());
		
		//printing the contents of the table
		
		for(int i=0;i<tableContains.size();i++)
		{
			System.out.print(tableContains.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
