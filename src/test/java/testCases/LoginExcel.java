package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.ReadExcel;

public class LoginExcel {
	
	@Test
	public void readExcel() throws IOException
	{
		ReadExcel re = new ReadExcel();
		System.out.println(re.getData());
		
	}

}
