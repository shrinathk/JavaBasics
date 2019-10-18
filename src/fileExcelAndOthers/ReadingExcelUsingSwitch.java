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

public class ReadingExcelUsingSwitch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("C:\\Users\\Neetu\\JavaFiles\\ExcelLoop.xls");
		FileInputStream fis = new FileInputStream(f);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet0 = book.getSheetAt(0);

		for (Row row : sheet0) {

			for (Cell cell : row) {

				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BLANK:
					System.out.print("NULL" + "\t");
					break;

				}
			}
			System.out.println();

		}

		fis.close();

	}

}
