package Himanshu.Himanshu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		By Selection = By.xpath("//input[@id='justAnInputBox']");
		By checkBox = By.xpath("//span[@class='comboTreeItemTitle']");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.findElement(Selection).click();
		
		//Clicking on the check boxes
		
		List<WebElement> optionsList = driver.findElements(checkBox);
		System.out.println(optionsList.size());
		System.out.println("********************************************");
		System.out.println(optionsList);
		System.out.println("ENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDENDEND");
		
		//Printing the options list
		
		for(int i =0;i<optionsList.size();i++) {
		String optionName =	optionsList.get(i).getText();
		System.out.println(" Option Name is : " +optionName);
		}
		driver.quit();
	}

}
