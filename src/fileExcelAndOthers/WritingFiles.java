package fileExcelAndOthers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		// Stream connectivity
		File f= new File("C:\\Users\\Neetu\\JavaFiles\\NewFile.txt");
		
		// If you want to append values to the file created, then we give boolean value as true in the constructor
		
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		// Writing inside a file
		
		writer.write("ABC");
		writer.newLine();
		writer.write("DEF");
		writer.newLine();
		writer.write("GHI");
		writer.newLine();
		// Closing stream
		
		writer.close();
		
		System.out.println("File is created !");
	}

}
