package com.redbus.qa.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.redbus.qa.base.Testbase;

public class Homepage extends Testbase {
	Actions a = new Actions(driver);
	// Create PageFactory
	// this code will find the element using xpath locator and store it in webelement object myaccount
	
	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")
	WebElement Source;
	
	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
	WebElement Destination;
	
	@FindBy(xpath="(By.id(\"date-box\"))")
	WebElement date;
	
	@FindBy(xpath="(By.id(\"search_butn\")")
	WebElement search;
	
	
	
	// create constructor of current class to initaiate the elements
	// every page class will ahve a constructor initiating the elements
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
		
	}

	
	// We will now write action methods, that will perform action on these elements
	//but these methods will not be executed here.
	
	public void gettitle() throws InterruptedException
	{
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
	}
	
	// method name is similar to action to be done
	
	public void clickonsource() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("Paris");
		 Thread.sleep(5000);
		 
		
	}
	
	public void clickondestination() throws InterruptedException 
	{
		  driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")) .sendKeys("London");  
	    Thread.sleep(5000);
	
	}
	
	public void clickonDate() throws InterruptedException
	{
    driver.findElement(By.id("date-box")).click();
    Thread.sleep(1000);
    driver.findElement( By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")) .click(); 
	Thread.sleep(5000);
	}
	
	public void clickonsearchbutton() throws InterruptedException
	{
		driver.findElement(By.id("search_butn")).click();
		Thread.sleep(5000);
	}
	
	
	}
	
	
	
	

	
	
	



