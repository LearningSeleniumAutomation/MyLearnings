package Himanshu.Himanshu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestShare {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blr8-110-113.apac.novell.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Rough work
		
		//Username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(5000);
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("novell");
		Thread.sleep(5000);
		//Login Button
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(10000);
		//select a File
		
		// MyFiles
		driver.findElement(By.xpath("//span[text()='My Files']")).click();
		Thread.sleep(10000);
		List<WebElement> filecount = driver.findElements(By.xpath("//div[@class='virtual-scroll-content']//div[contains(@class,'virtual-grid-column')]//span[contains(@class,'filename')]"));
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		System.out.println("File count is =" +filecount.size());
		System.out.println("<<<<<<<<<<<<<<<<<<<<");
		for(int i =0;i<filecount.size();i++)
		{
			System.out.println("************************");
			System.out.println(filecount.get(i).getText());
			System.out.println("#######################");
		}
		//driver.findElement(By.xpath("//span[contains(text(),'0KB.txt')]")).click();;
		//Thread.sleep(5000);
		
		
		//Right Click
		
		
//		Actions action = new Actions(driver);
//		//pass the xpath for File namwe
//		action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'0KB.txt')]"))).perform();
//		Thread.sleep(10000);
//		
	}

}
