package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FatchingData extends Base implements AutoConstant 
{
	public String getCellValue(String SheetName ,int RowNum ,int CellNum ) throws Throwable
	{
		FileInputStream fis = new FileInputStream(PathOfExcelSheet);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String CellValue = wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum).getStringCellValue();
		
		return CellValue;
	}
	
	public String GetPropertyName(String Key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(PathOfPropertiesFile);
		Properties prop = new Properties();
		prop.load(fis);
		
		String property = prop.getProperty(Key);
		
		return property;
		
		
	}

}
