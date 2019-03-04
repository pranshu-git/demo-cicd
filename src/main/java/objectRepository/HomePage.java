package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	By SignIn = By.linkText("Sign in");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignInLink()
	{
		return driver.findElement(SignIn);
	}

}
