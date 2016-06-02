/*
 * @author Anjali
 * @since   2016-05-31
 */
package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils 
{
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static Object [][] getDataFromExcel(String filePath, String SheetName) throws Exception
	{
		Object [][] data= null;
		//String data [][] = null;
		try
		{
			FileInputStream ExcelFile = new FileInputStream(filePath);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 1;
			int startColumn = 0;
			int ci, cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			System.out.println("Number of rows "+totalRows);
			//function to get the total no of cols
			//int totalCols = 3;
			int totalCols = ExcelWSheet.getRow(0).getLastCellNum();
			System.out.println("Number of columns"+totalCols);
			data = new String[totalRows][totalCols];
			ci = 0;
			for (int i=startRow;i<=data.length;i++)
			{
				cj=0;
				for (int j=startColumn;j<data[0].length;j++)
				{
					System.out.println("cell no " + i +","+j);
					data[ci][cj]=getCellData(i,j);
					System.out.println(data[ci][cj]);  
					cj++;
				}
				ci++;
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}

		catch (IOException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return (data);
		
	}
	public static Object getCellData(int RowNum, int ColNum) throws Exception 
	{
		 
		try
		{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			//int dataType = Cell.getCellType();
			if(Cell.getCellType() == 0)
				Cell.getNumericCellValue();
			else if(Cell.getCellType() == 1)
				return Cell.getStringCellValue();
			else if (Cell.getCellType() == 3)
				return "";
			else if(Cell.getCellType() == 4)
				return Cell.getBooleanCellValue();
			/*if  (dataType == 3)
			{
				return "";
			}
			else
			{
				String CellData = Cell.getStringCellValue();
			    return CellData;

			}*/
		}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			    throw (e);

			}
		return "";

		}
}
