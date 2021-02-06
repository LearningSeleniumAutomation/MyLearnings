package Himanshu.Himanshu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIghtClickContextMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		By rightClick = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement box = driver.findElement(rightClick);
		
		Actions action = new Actions(driver);
		
		/*
		 * process 1 using directly context click on the webElement 
		 */
		
		//action.contextClick(box).perform();
		
		/*
		 * process 2 process 1 using move to webElement
		 */
		
		action.moveToElement(box).contextClick().perform();
		
		// Getting options from Right click context menu 
		
		/*
		 * Using not contains method in Xpath
		 */
		
		By rightClickOptionsUsingNotContains = By.xpath("//ul[contains(@class,'context-menu-list')]/li[not(contains(@class,'separator'))]");
		
		List<WebElement> elem = driver.findElements(rightClickOptionsUsingNotContains);
		System.out.println("Right click context menu Size is :" +elem.size());
		for(int i =0;i<elem.size();i++)
		{
			System.out.println(elem.get(i).getText());
		}
		Thread.sleep(5000);
		
		//To click Anywhere on the screen to close some opned right click or pop up box
		action.click();
		
		By doubleClick = By.xpath("//button[text()='Double-Click Me To See Alert']");
		WebElement targetDoubleClick = driver.findElement(doubleClick);
		action.moveToElement(targetDoubleClick).doubleClick().perform();
		
		//Capturing Alert
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert message : -->" +alert.getText());
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
