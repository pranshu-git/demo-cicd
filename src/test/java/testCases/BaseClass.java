package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public WebDriver driver=null;
	Properties prop;
	public WebDriver getdriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium\\POM\\Config.properties");
		prop.load(fis);
		
		if (prop.getProperty("Browser").contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("Browser").contains("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\gekodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("Browser").contains("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ie.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
