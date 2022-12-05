package Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import Log.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Browser 
{
	public static WebDriver driver;	
	public static WebDriverWait wait;
	public static ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Extentreports/extentreport.html");
	public static ExtentReports extent= new ExtentReports();
	public static WebDriver openBrowser() throws IOException
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Opening browser extent test");
		logger.log(Status.INFO, "Opening browser");
		try {
			String browserChoice = Browser.getProperties("browser");
			if (browserChoice.equals("chrome")) {
				driver = setChromeDriver();
			} 
			else if (browserChoice.equals("firefox")) {
				driver = setFirefoxDriver();
			} 
			else if (browserChoice == "Edge") {
				driver = setEdgeDriver();
			} 
			else { 
				System.out.println("Invalid data...");
			}
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Open browser failed!");
			System.out.println("Browser Input");
			System.out.println(e);
		}
			driver.manage().window().maximize();
			extent.flush();
			return driver;
	}
	
	public static WebDriver setChromeDriver() 
	{
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Opening Chrome browser extent test");
		logger.log(Status.INFO, "Opening Chrome browser");
		try 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome");
		}catch(Exception e) 
		{
			logger.log(Status.FAIL, "Opening chrome browser failed!");
			System.out.println("Chrome");
			System.out.println(e);
		}
		extent.flush();
		return driver;
	}
	
	public static WebDriver setFirefoxDriver() 
	{
		Log.log4jMethod(2);
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Opening firefox browser extent test");
		logger.log(Status.INFO, "Opening firefox browser");
		try {
			Log.log4jMethod(1);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}catch(Exception e)
		{
			Log.log4jMethod(4);
			logger.log(Status.FAIL, "Opening firefox browser failed!");
			System.out.println("Firefox");
			System.out.println(e);
		}
		extent.flush();
		return driver;
	}

	public static WebDriver setEdgeDriver() 
	{
		
		Log.log4jMethod(2);
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Opening edge browser extent test");
		logger.log(Status.INFO, "Opening edge browser");
		try {
			Log.log4jMethod(1);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		catch(Exception e){
			Log.log4jMethod(4);
			logger.log(Status.FAIL, "Opening firefox browser failed!");
			System.out.println("Edge");
			System.out.println(e);
		}
		extent.flush();
		return driver;
	}
	public static String getProperties(String propertiesData) throws IOException{
		String returnData = null;
		String searchData = propertiesData;//browser
		try {
			String filelocation = System.getProperty("user.dir") + "\\src\\main\\resources\\configuration.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			returnData = prop.getProperty(searchData); //browser
			}catch(Exception e)
			{
			System.out.println("Properties");
			}
		return returnData;
	}
	
	public static void getURL(String url){
		try {
			driver.get(url);
			driver.manage().deleteAllCookies();
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contentBody\"]/div[2]/div[2]/div/button[2]")));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String getTitle() throws Exception {
		String actualTitle = driver.getTitle();
		return actualTitle;			
	}

	public static void closeBrowser() 
	{
		try 
		{
			driver.quit();
		}catch(Exception e)
		{
			System.out.println("closing");
		}
	}
}
