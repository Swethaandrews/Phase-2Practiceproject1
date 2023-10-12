package com.redbus.qa.testpages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.redbus.qa.base.Testbase;
import com.redbus.qa.Pages.Homepage;

public class Homepagetest extends Testbase {
	Homepage hp;

	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new Homepage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	@Test(priority='1')
	public void testTitle() throws InterruptedException
	{
		
		hp.gettitle();
	}
	@Test(priority='2')
	

	public void testsource() throws InterruptedException
	{
		hp.clickonsource();
		hp.gettitle();
	}

	@Test(priority='3')
	public void testdestination() throws InterruptedException
	{
		hp.clickondestination();
		hp.gettitle();
	}
	@Test(priority='4')
	public void testdate() throws InterruptedException
	{
		hp.clickonDate();
		hp.gettitle();
		
	}
	@Test(priority='5')
	public void testsearch() throws InterruptedException
	{
		hp.clickonsearchbutton();
		hp.gettitle();
		
	}
	
	
	
	
	
	
	

}
