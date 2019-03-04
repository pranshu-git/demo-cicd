package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class LoginTestCase extends BaseClass {
	
	
	
	@Test(dataProvider="testdata")
	public void test1(String username, String Password) throws IOException
	{
		driver = getdriver();
		
		driver.get(prop.getProperty("URL"));
		
		HomePage hp = new HomePage(driver);
		hp.getSignInLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(Password);
	}
	
	@DataProvider
	public static Object[][] testdata()

	{
		Object[][] Obj = new Object[2][2];
		Obj[0][0] = "hello";
		Obj[0][1] = "hi2132321";
		
		Obj[1][0] = "hi";
		Obj[1][1] = "hi2132321";
		return Obj;
	}
	
	@AfterTest()
	public void quitbrowser()
	{
		driver.quit();
	}
	

}
