package Himanshu.Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.urlContains("amazon"));
		System.out.println("Success ");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
