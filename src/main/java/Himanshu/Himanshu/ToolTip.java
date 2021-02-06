package Himanshu.Himanshu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url = "http://demo.guru99.com/test/tooltip.html";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

		
		//By Locators
		
		By DownloadNow = By.xpath("//a[@id='download_now']");
		
		driver.findElement(DownloadNow);
	
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(DownloadNow)).build().perform();
		
		By tooltip = By.xpath("//div[@class='tooltip']//tbody//td");
		List<WebElement> elem = driver.findElements(tooltip);
		
		for(int i=0;i<elem.size();i++)
		{
			System.out.println(" "+elem.get(i).getText());
		}
		
		
	}

}
