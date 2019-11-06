package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getData(String fileName, String sheetName) throws IOException {
		File file = new File("Script.xlsx");
		FileInputStream ips = new FileInputStream(file);

		Workbook Wb = new XSSFWorkbook(ips);
		Sheet Sh = Wb.getSheet(sheetName);
		int rowNum = Sh.getLastRowNum() + 1;
		int colNum = Sh.getRow(0).getLastCellNum();

		// Create data array with its dimensions to store info from xlsx file
		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {
			Row row = Sh.getRow(i);
			for (int j = 0; j < colNum; j++) {
				Cell cell = row.getCell(j);
				String value = new DataFormatter().formatCellValue(cell);
				data[i][j] = value;
			}
		}
		Wb.close();
		return data;
	}
}