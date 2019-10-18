package fileExcelAndOthers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {


		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet0 = book.createSheet("Sheet1");
		Row row0 = sheet0.createRow(0);
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		cellA.setCellValue("FirstCell");
		cellB.setCellValue("Secondcell");
		
		File f = new File("C:\\Users\\Neetu\\JavaFiles\\excel.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		
		fos.close();
		
		System.out.println("Excel file is created");
		

	}

}
