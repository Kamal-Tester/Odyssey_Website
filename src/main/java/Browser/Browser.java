package Browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.Cookie;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

import Browser.Browser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

public class Browser {
	public static WebDriver driver;

	/*
	 * Reading the data from properties file
	 */
	public static String fileProperties(String propertiesData)// browser
	{
		String returnData = null;

		try {
			String filelocation = System.getProperty("user.dir") + "//src//main//resources//configuration.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			returnData = prop.getProperty(propertiesData); // browser
		} catch (Exception e) {
			System.out.println("Properties" + e);
		}
		return returnData;
	}

	/*
	 * WebDriver Setup Selection Method
	 */
	public static WebDriver setDriver() {
		try {

			String browserChoice = Browser.fileProperties("browser");// chrome

			if (browserChoice.equals("chrome")) {
				driver = setChromeDriver();
			} else if (browserChoice.equals("firefox")) {
				driver = setFirefoxDriver();
			} else if (browserChoice == "Edge") {
				driver = setEdgeDriver();
			} else {
				System.out.println("Invalid data...");
			}

		} catch (Exception e) {
			System.out.println("Browser Input");
			System.out.println(e);
		}
		return driver;
	}

	/*
	 * ChromeDriver Setup Method
	 */
	private static WebDriver setChromeDriver() {
		try {
			
			
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().driverVersion("127.0.6533.99").create();
			
		 driver = new ChromeDriver(chromeOptions);
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\H3TJL13.cgi\\Downloads\\chromedriver125.exe"); //WebDriver driver
			 * = new ChromeDriver();
			 * 
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--remote-allow-origins=*"); ChromeDriver driver = new
			 * ChromeDriver(options);
			 * 
			 * driver = new ChromeDriver();
			 */
		} catch (Exception e) {
			System.out.println("Chrome");
			System.out.println(e);
		}
		return driver;
	}

	// FireFox setup method
	private static WebDriver setFirefoxDriver() {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} catch (Exception e) {
			System.out.println("Firefox");
			System.out.println(e);
		}
		return driver;
	}

	// FireFox setup method
	private static WebDriver setEdgeDriver() {
		try {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} catch (Exception e) {
			System.out.println("Edge");
			System.out.println(e);
		}
		return driver;
	}

	// Url Setup Method
	public static void Website() throws Exception {
		try {
			driver.manage().window().maximize();
			driver.get("https://odyssey.in/");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println("URL Method");
		}
	}

	// Method to get title of the browser window
	public static String getTitle() throws Exception {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	// Driver Close Method
	public static void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("closing");
		}
	}
}
