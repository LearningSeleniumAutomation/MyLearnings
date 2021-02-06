package Himanshu.Himanshu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		By column1 = By.xpath("//div[@class='rt-td'][1]");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> firstName = driver.findElements(column1);
		for(int i =0;i<firstName.size();i++)
		{
			System.out.println("First name Cloumn contains the following name :" +firstName.get(i).getText());
		}
		
		//Registration Form
		
		By addNewRecord = By.xpath("//button[@id='addNewRecordButton']");
		By modalHeaderRegistrationForm = By.xpath("//div[@class='modal-content']//div[text()='Registration Form']");
		By registartionFirstName = By.xpath("//div[@class='modal-content']//input[@id='firstName']");
		
		
		//By modalHeaderRegistrationForm = By.xpath("//div[text()='Registration Form']");
		//By registartionFirstName = By.xpath("//input[@id='firstName']");
		
		
		driver.findElement(addNewRecord).click();
		Thread.sleep(2000);
		String HeaderName = driver.findElement(modalHeaderRegistrationForm).getText();
		
		if(HeaderName.equalsIgnoreCase("Registration Form"))
		{
			System.out.println("You are going in the right direction:  " + HeaderName);
			driver.findElement(registartionFirstName).sendKeys("Himanshu");
		}
		else 
		{
			System.out.println("{Please check the Xpath!!!");
		}
		
		
			
		
		
		
		driver.quit();
	}

}
