package Himanshu.Himanshu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserzNavigations {
	private static WebDriver driver = null;
	Logger log = Logger.getLogger("Logs");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		 //  js.executeScript(Script,Arguments);

		FilrAngularUI_PageObject fan = new FilrAngularUI_PageObject(driver);
		driver.get("https://blr8-110-113.apac.novell.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fan.loginUsername().sendKeys("admin");
		fan.loginPassword().sendKeys("novell");
		fan.login_Btn().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fan.My_Files().click();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID  is :>>>>>>" + parent);

		
		
		//Last Modification Time 
		By lastmodisificationTime = By.xpath("//nav//span[contains(text(),'Last modification')]");
		
		//Document Name
		By documentName = By.xpath("//div//input[@id='document-name-input']");
		
		//Number of pages
		By numberOfPages = By.xpath("//div[@id='toolbar-down']//div[@id='StatePageNumber']");
		
		//File name can be read from properties file
		By TargetlocatoronWhichRightClickneedtoBedone = By.xpath("//div//span[contains(text(),'abc12345.txt')]");
		
		//Context menu options
		By rightClickContextMenu = By.xpath("//div[@class='dropdown open show']//li");
		
		//FileName -->Neha2.docx
		
		By scrollTillTheFileName = By.xpath("//div//span[contains(text(),'Neha2.docx')]");
		
		
	
/*
 * 	// Listing number of Files inside the Folder
 

		// By Locator for Headers
		// div[@id='myTable']//span[not(contains(@class,'ux-checkbox'))]

		By TableHeader = By.xpath("//div[@id='myTable']//span[not(contains(@class,'ux-checkbox'))]");
		List<WebElement> ColumnName = driver.findElements(TableHeader);
		for(int i=0;i<ColumnName.size();i++)
		{
			System.out.print( "\t"+ColumnName.get(i).getText());
		}
		
		//EditOnline
		//driver.findElement(By.xpath("//span[contains(text(),'Online')]")).click();
		// Perfroming operation in Child Windows

		//Listing all the Files/Folders in a page
		
		By ListFilesAndFolders = By.xpath("//div[@id='myTable']//span[contains(text(),'NAME')]/ancestor::div//div[@class='virtual-grid-column file-name-column']");

		System.out.println(">>>>>>>Going back to My Files Area<<<<<<<");
		fan.My_Files().click();
	List<WebElement> elements=	driver.findElements(ListFilesAndFolders);
	for(int i=0;i<elements.size();i++)
	{
		System.out.println(elements.get(i).getText());
	}
 */
		
		
		editOnlineFile(TargetlocatoronWhichRightClickneedtoBedone, "Edit Online");
		doWindowsHandleforNewCEtab(parent, documentName, lastmodisificationTime, numberOfPages);
		Thread.sleep(5000);
		//verticalScroll(scrollTillTheFileName);
		//pageUpDown();
		Thread.sleep(5000);
		
		driver.quit();

	}

	public static void getSetofBrowserID(Set<String> windowsID, String ParentID, By lastmodisificationTime ,By documentName ,By numberOfPages) throws InterruptedException
	{
		//windowsID = new HashSet<String>();
		
	
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			//String ID = it.next();
		//	System.out.println(ID);
			if(it.next()!=ParentID)
			{
				//Thread.sleep(10000);
				driver.switchTo().window(it.next());
				//Thread.sleep(5000);
				String ChildWindowURL = driver.getCurrentUrl();
				System.out.println(ChildWindowURL);
				
			//	Thread.sleep(10000);
				System.out.println("File Name is : >>"+ getWebElement(documentName).getText() );
				System.out.println("Last modification time of the File >>"+ getWebElement(lastmodisificationTime).getText() );
				System.out.println("Number of pages  >>"+ getWebElement(numberOfPages).getText() );
				
			}
		}
	}
	
	
	
	/**
	 * @param locator
	 * @return WebElement for any locator given
	 */
	public static WebElement getWebElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	
	/**
	 * @param driver
	 * @param TargetlocatoronWhichRightClickneedtoBedone
	 * @return list of Web Elements
	 */
	public static List<WebElement> contextClickOption(WebDriver driver,By TargetlocatoronWhichRightClickneedtoBedone)
	{
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(TargetlocatoronWhichRightClickneedtoBedone)).perform();
		//to get all the right click options
		return driver.findElements(By.xpath("//div[@class='dropdown open show']//li"));
		
	
}
	
	
	/**
	 * @param locatorOfFile
	 * @param option
	 * call this method for Editing online anyFile
	 */
	public static void editOnlineFile(By locatorOfFile,String option)
	{
		List<WebElement>options = contextClickOption(driver, locatorOfFile);
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().contains(option))
			{
				options.get(i).click();
				break;
			}
		}
		
	}
	
	/**
	 * @param parentWindowID
	 * @param documentName
	 * @param lastmodisificationTime
	 * @param numberOfPages
	 * Call this method after "editOnlineFileMethod
	 */
	public static void doWindowsHandleforNewCEtab(String parentWindowID,By documentName,By lastmodisificationTime,By numberOfPages)
	{
		Set<String>windowsID =	driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			//String ID = it.next();
		//	System.out.println(ID);
			if(it.next()!=parentWindowID)
			{
				//Thread.sleep(10000);
				driver.switchTo().window(it.next());
				//Thread.sleep(5000);
				String ChildWindowURL = driver.getCurrentUrl();
				System.out.println(ChildWindowURL);
				
			//	Thread.sleep(10000);
				System.out.println("File Name is : >>"+ getWebElement(documentName).getText() );
				System.out.println("Last modification time of the File >>"+ getWebElement(lastmodisificationTime).getText() );
				System.out.println("Number of pages  >>"+ getWebElement(numberOfPages).getText() );
				
				
			}
		}
	}
	
	public static void verticalScroll(By locator)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
				

        WebElement Element = getWebElement(locator);

        //This will scroll the page Horizontally till the element is found		
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
	
	public static void pageUpDown() throws InterruptedException
	{
		Actions action = new Actions(driver);
		 action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
}
