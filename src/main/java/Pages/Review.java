package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;

public class Review extends Browser
{
	static WebElement rev;
	static WebElement search;
	static String testData=null;
	static String actualTitle;
	public static void ReviewOption() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click on review option extent test");
		logger.log(Status.INFO, "clicking review option");
		try 
		{
			rev = driver.findElement(By.xpath("//*[@id='lithium-root']/header/div/nav/div/div[2]/div/a"));
			rev.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		
	}

	public static void Searchelement(String data) 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Searching Element to review extent test");
		logger.log(Status.INFO, "Searching Element to review");
		try 
		{
			testData=data;
			search = driver.findElement(By.xpath("//*[@id='component_1']/div/div/div/div/input"));
			search.sendKeys(data);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
				
	}
	
	public static void pressEnter() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Press Enter Key");
		logger.log(Status.INFO, "Pressing Enter Key");
		try 
		{
			search.sendKeys(Keys.ENTER);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		
	}
	public static String verify() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Verify Road trip page extent test");
		logger.log(Status.INFO, "verifying road trip page");
		try 
		{
			RentalCars.getURL("https://www.tripadvisor.com/UserReviewEdit-g304556-d19107092-a_referredFromLocationSearch.true-a_ReviewName.-a_type.-e-wpage1");
			wait.until(ExpectedConditions.titleIs(driver.getTitle()));
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e)
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
			
		}
		return actualTitle;
	} 
	
}
