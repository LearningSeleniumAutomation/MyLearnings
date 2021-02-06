package Himanshu.Himanshu;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubspotContactsPage {

	static String innings;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//https://app.hubspot.com/contacts/9094332/objects/0-1/views/all/list
		
		//span[text()='Mrs otter']/ancestor::td/preceding-sibling::td//input[@type='checkbox'] --> check this xpath as its not selecting the box
		//span[text()='Mrs otter']/ancestor::td/preceding-sibling::td//following-sibling::td/a
		
		/*
		 * Getting wicket taker 
		 * 
		 * //a[text()='Herschelle Gibbs']/ancestor::td//following-sibling::td[text()='c Mohammad Hafeez b Umar Gul']
		 * 
		 * to get all stats like avg 4s 6s runs
		 * //a[text()='Herschelle Gibbs']/ancestor::td//following-sibling::td/following-sibling::td
		 * 
		 * 
		 * getting title of 1st Innings
		 * //span//h5[text()='South Africa 1st INNINGS ']
		 * //span//h5[text()='South Africa 2nd INNINGS ']
		 * 
		 * getting Player name
		 * 
		 * //a[text()='Herschelle Gibbs']
		 */
		String url = "https://www.espncricinfo.com/series/south-africa-tour-of-pakistan-2007-08-299001/pakistan-vs-south-africa-1st-test-299004/full-scorecard";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		Thread.sleep(5000);
		
		innings = driver.findElement(By.xpath("//span//h5[text()='South Africa 1st INNINGS ']")).getText();
		System.out.println(innings);
		//innings.equalsIgnoreCase("South Africa 1st INNINGS ");
		Scanner in = new Scanner(System.in);
		System.out.println("Which Innings Score you need 1st or 2nd"
				+ "for 1st Innings press 1"
				+ "for 2nd Innings press 2");
//		int options = in.nextInt();;
//		
//		switch (options) {
//		case 1:
//			System.out.println("Player Name is :"+ driver.findElement(By.xpath("//a[text()='Herschelle Gibbs']")).getText());
//			
//			break;
//
//		default:
//			break;
//		}
//		
		String name = "Graeme Smith";
		By playername = By.xpath("//a[text()='"+name+"']");

		getScoreCard(playername, "Graeme Smith");
	
		driver.quit();
		
		
	}
	
	
	
	public static void getScoreCard(By locator, String playerName)
	{
		int counter =0;
	if(innings.toLowerCase().contains("1st"))
	{
		System.out.println("Player Name is : "+ driver.findElement(locator).getText());
		System.out.println("------player Score-----");
		List<WebElement> score_card=driver.findElements(By.xpath("//a[text()='Graeme Smith']/ancestor::td//following-sibling::td/following-sibling::td"));
		System.out.printf("\t" + "R	B	M	4s	6s	SR");
		System.out.println();
		for(int i=0;i<score_card.size();i++)
		{
			
			System.out.printf("\t"+score_card.get(i).getText());
			counter++;
			if(counter==6)
				break;
		}
	}
	}
	
	
	
	
	

}
