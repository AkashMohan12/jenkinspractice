package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;

public class RoadTrip extends Browser
{
	static WebElement click;
	static List<WebElement> select; 
	static WebElement selectRoute;
	static String actualTitle;
	public static void clickMoreOption() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click on more option extent test");
		logger.log(Status.INFO, "clicking More option");
		try 
		{
			click = driver.findElement(By.xpath("//*[@id='lithium-root']/main/div[1]/div[2]/div/div/div[17]"));
			click.click();
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
			RentalCars.getURL("https://www.tripadvisor.com/RoadTrip-g191-United_States.html");
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
	
	public static void selectRoute() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("select Route extent test");
		logger.log(Status.INFO, "Selecting Route");
		try 
		{
			selectRoute = driver.findElement(By.xpath("//*[@id=\"taplc_road_trips_0\"]/div[2]/div/div[1]/div"));
			selectRoute.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
	}

}
