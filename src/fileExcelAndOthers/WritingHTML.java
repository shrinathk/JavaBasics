package fileExcelAndOthers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingHTML {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Neetu\\JavaFiles\\NewHTML.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("<html><body><title>Created HTML file</title><h1>This is the header</h1></body></html>");	
		writer.close();
		
	}

}
