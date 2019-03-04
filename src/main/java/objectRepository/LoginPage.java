package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By Username = By.id("login1");
	By Password = By.id("password");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}

}
