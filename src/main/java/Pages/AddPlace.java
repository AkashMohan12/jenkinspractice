package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;

public class AddPlace extends Browser
{
	static String actualTitle;
	static WebElement add;
	static WebElement clickNo;
	static WebElement clickcontinue;
	public static String verify()
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Verify Add a Place page extent test");
		logger.log(Status.INFO, "verifying Add a Page page");
		try 
		{
			RentalCars.getURL("https://www.tripadvisor.com/CreateListing.html");
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
	
	public static void clickListAccommodation() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click on  list accommodation extent test");
		logger.log(Status.INFO, "clicking list accomodation option");
		try 
		{
			add = driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div[4]/div[1]/div/div[2]/div/button[1]"));
			add.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
	}
	public static void clickNo() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click on no option extent test");
		logger.log(Status.INFO, "clicking no option option");
		try 
		{
			clickNo = driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div[4]/div[2]/div/div[2]/div/div/div[2]/button"));
			clickNo.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
	}
	public static void clickContinue() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click on continue extent test");
		logger.log(Status.INFO, "clicking continue option");
		try 
		{
			clickcontinue = driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div[5]/div/button/span"));
			clickcontinue.click();
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
	}

}
