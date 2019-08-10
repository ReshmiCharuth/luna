package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = 
				new XSSFWorkbook("./D://selenium//selenium//data/Exceldatatesting.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		//		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println("Row num is "+rowNum);
		short cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Column num is "+cellNum);
		for (int j = 1; j <= rowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < cellNum; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		wbook.close();
	}


}
