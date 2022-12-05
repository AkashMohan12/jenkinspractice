package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;

public class RentalCars extends Browser
{
	static List<WebElement> select; 
	static WebElement location; 
	static String testData=null;
	static String actualTitle;
	public static void selectItem(String item) 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("click Rental Cars extent test");
		logger.log(Status.INFO, "clicking Rental Cars");
		try 
		{
			if(item.equals("Rental Cars")) 
			{
				select = driver.findElements(By.xpath("//*[@id='lithium-root']/main/div[1]/div[2]/div/div/div[17]/div/div/ul/li"));
				System.out.println(select.size()); 
				
				for(int i=0; i<select.size(); i++)
				{
					String rentalText = select.get(i).getText(); 		//<Text>
					System.out.println(rentalText);
					if(rentalText.contains("Rental Cars")) 
					{
						select.get(i).click();
						break;
					}
				}
			}
			else if(item.equals("Road Trips")) 
			{
				select = driver.findElements(By.xpath("//*[@id='lithium-root']/main/div[1]/div[2]/div/div/div[17]/div/div/ul/li"));
				System.out.println(select.size()); 
				
				for(int i=0; i<select.size(); i++)
				{
					String rentalText = select.get(i).getText(); 		//<Text>
					System.out.println(rentalText);
					if(rentalText.contains("Road Trip")) 
					{
						select.get(i).click();
						break;
					}
				}
			}
			else if(item.equals("Add a Place")) 
			{
				select = driver.findElements(By.xpath("//*[@id='lithium-root']/main/div[1]/div[2]/div/div/div[17]/div/div/ul/li"));
				System.out.println(select.size()); 
				
				for(int i=0; i<select.size(); i++)
				{
					String rentalText = select.get(i).getText(); 		//<Text>
					System.out.println(rentalText);
					if(rentalText.contains("Add a Place")) 
					{
						select.get(i).click();
						break;
					}
				}
			}
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		extent.flush();
		
	}
	
	public static String verify() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Verify Rental Cars page extent test");
		logger.log(Status.INFO, "Verifying Rental Cars");
		try 
		{
			RentalCars.getURL("https://www.tripadvisor.com/RentalCars");
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
	
	public static void pickuplocation(String loc) 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Enter pickup location extent test");
		logger.log(Status.INFO, "Entering pickup location");
		try 
		{
			testData=loc;
			location = driver.findElement(By.cssSelector("#lithium-root > main > div > div.taqDS > div:nth-child(2) > div.WGBEz._T.z.iHGzK.R2 > div > div.ljwBl.K > div.dJyDC.z > div.OxZQG.w > div.RAzRG.lrawV > div > div > div > div > div > div.iQyFY > input"));
			location.click();
			location.sendKeys(loc);
			location.sendKeys(Keys.ENTER);
			logger.log(Status.PASS, "Test pass");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Test failed");
			System.out.println(e);
		}
		
	}
}
