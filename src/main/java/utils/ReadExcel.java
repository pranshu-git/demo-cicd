package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public ArrayList<String> getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Selenium\\POM\\test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		ArrayList<String> a = new ArrayList<String>();
		
		int sheets = wb.getNumberOfSheets();
		for(int i = 0;i<sheets;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("Sheet1"))
					{
						XSSFSheet sheet = wb.getSheetAt(i);
						Iterator<Row> rows = sheet.iterator();
						Row firstrow = rows.next();
						Iterator<Cell> ce = firstrow.cellIterator();
						int column=0;
						int k = 0;
						while(ce.hasNext())
						{
							Cell value = ce.next();
							if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
							{
								column=k;
								break;
							}
							k++;
						}
						//System.out.println(column);
						
						while (rows.hasNext())
						{
							Row r = rows.next();
							if(r.getCell(column).getStringCellValue().equalsIgnoreCase("TC1"))
							{
								Iterator<Cell> cv = r.cellIterator();
								while(cv.hasNext())
								{
									Cell cvalue = cv.next();
									a.add(cvalue.getStringCellValue());
								}
							}
						}
						
					}
		}
		return a;

	}

}
