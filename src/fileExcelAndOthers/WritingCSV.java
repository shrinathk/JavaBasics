package fileExcelAndOthers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCSV {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Neetu\\JavaFiles\\NewExcel.csv");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("Name");
		writer.write(",");
		writer.write("Navaneeta");
		writer.newLine();
		writer.write("Location");
		writer.write(",");
		writer.write("Serilingampally");	
		writer.close();
		
	}

}
