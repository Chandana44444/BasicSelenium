package reading_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFrom_ExcelFile {
public static void main(String[] args) throws IOException {
	File f=new File("./read_data/Excel.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
//	System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).getNumericCellValue());
//	System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue());
//	System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1).getLocalDateTimeCellValue());
//	System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue());
//	System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
//	System.out.println("******************************");
//	System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).toString());
//	System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(2).toString());
//	System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1).toString());
//	System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).toString());
	//write data
	FileOutputStream fos=new FileOutputStream(f);
	wb.getSheet("Sheet1").createRow(0).createCell(3).setCellValue("7-9am");
	wb.write(fos);
	System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(3).toString());
}
}
