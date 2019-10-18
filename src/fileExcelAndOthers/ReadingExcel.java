package fileExcelAndOthers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		File f = new File("C:\\Users\\Neetu\\JavaFiles\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet0 = book.getSheet("Sheet1");
		Row row0 = sheet0.getRow(0);
		
		Cell cellA = row0.getCell(1);
		
		System.out.println(cellA);
		
		fis.close();

	}

}
