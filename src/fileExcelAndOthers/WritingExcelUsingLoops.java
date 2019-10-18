package fileExcelAndOthers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelUsingLoops {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet0 = book.createSheet();
		
		for(int i = 0 ; i < 10 ; i++) {
			Row row = sheet0.createRow(i);
			
			for(int j = 0 ; j < 10 ; j++) {
				
				Cell cell = row.createCell(j);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		File f = new File("C:\\Users\\Neetu\\JavaFiles\\ExcelLoop.xls");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		
		fos.close();
		
		
		System.out.println("File created !");
	}

}
