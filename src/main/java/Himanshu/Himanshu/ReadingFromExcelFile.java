package Himanshu.Himanshu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class ReadingFromExcelFile {

	public static Object[][] ExcelUtil()
	{
		Object[][] data = null;
		try {
			FileInputStream fis = new FileInputStream("./Drivers/Contacts.xlsx");
		Workbook book =	WorkbookFactory.create(fis);
		Sheet sheet =	book.getSheet("Details");
			//XSSFWorkbook wb = new XSSFWorkbook(fis);
			//String sheet = wb.getSheetName(0);
			//System.out.println("SheetName is: " +sheet);
		int rowSize = sheet.getLastRowNum();
		System.out.println("Row Size is :" +rowSize);
		
		int columnSize = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Size is: " +columnSize);
		
		data = new Object[rowSize][columnSize];
		
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j);
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		
	
		} 	
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return data;
	}//end of method
	
	
	
	public static void main(String[] args) throws IOException   
	{  
		
		ExcelUtil();
	}
}
	





