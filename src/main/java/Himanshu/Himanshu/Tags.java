package Himanshu.Himanshu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "http://demo.guru99.com/test/block.html";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		//By Locator for inside block element tag
		
		By tagNameText = By.xpath("//a[contains(text(),' Inside a block-level tag')]");
		
		//By Locator for outside block element tag
		By tagNameText1 = By.xpath("//a//span[contains(text(),'Outside a block-level tag')]");
		
		//Getting all links from a webpage
		
		By allLinks = By.xpath("//a[contains(@href,'')]");
		
		//String tagName  = driver.findElement(tagNameText).getText();
		//System.out.println("Tag name is : --> " +tagName);
		
		Thread.sleep(5000);
		List<WebElement> links =driver.findElements(allLinks);
		
		System.out.println("Total number of links available on the page is : " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println("Link" +"["+i+"]" +links.get(i).getAttribute("href"));
		}
		
		
		driver.quit();
	}

}
