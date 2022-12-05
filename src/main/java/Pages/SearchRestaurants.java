package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchRestaurants extends Browser 
{
	static WebElement search;
	static WebElement click;
	static String actualTitle;
	static String testData=null;
	static String error;
	public static void clickRestaurants() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click restaurants extent test");
		logger.log(Status.INFO, "clicking restaurants");
		try 
		{
			click = driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[1]/div[2]/div/div/div[4]/a/span[1]"));
			click.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		extent.flush();
	}
	
	public static void searchLocation(String data) 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Search Location extent test");
		logger.log(Status.INFO, "searching location");
		try 
		{
			testData=data;
			search = driver.findElement(By.xpath("/html/body/div[3]/div/form/input[1]"));
			search.sendKeys(data);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		extent.flush();
	}

	public static void pressEnter() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Press Enter Key extent test");
		logger.log(Status.INFO, "pressing Enter Key");
		try 
		{
			search.sendKeys(Keys.ENTER);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		extent.flush();
	}
	
	
	public static String checkPage() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Verify Restaurant page extent test");
		logger.log(Status.INFO, "verifying Restaurant page");
		try 
		{
			RentalCars.getURL("https://www.tripadvisor.com/Restaurants-g304556-Chennai_Madras_Chennai_District_Tamil_Nadu.html");
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
	public static String Error() 
	{
		error = driver.findElement(By.className("title-match")).getText();
		System.out.println(error);
		return error;
	}
	
	
}
