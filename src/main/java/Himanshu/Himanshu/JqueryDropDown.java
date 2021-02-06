package Himanshu.Himanshu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//div[@class='aajZCb']/ul/li	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		By google = By.xpath("//ul[@class='erkvQe']/li//span");
		By test = By.xpath("//div[@class='aajZCb']/ul/li");
		
		List<WebElement> searchResults =driver.findElements(test);
		System.out.println(searchResults.size());
		
		for(int i =0;i<searchResults.size();i++)
		{
			String text = searchResults.get(i).getText();
			System.out.println(text);
		}
		
		driver.quit();
	
	}

}
