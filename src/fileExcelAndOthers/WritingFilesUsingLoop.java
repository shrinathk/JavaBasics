package fileExcelAndOthers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFilesUsingLoop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Neetu\\JavaFiles\\LoopFile.txt");
		FileWriter fis = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fis);
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3 ; j++) {
				
				int num = (int)(Math.random()*100);
				writer.write(num + "\t");
			}
			
			writer.newLine();
		}
		
		writer.close();
		
	}

}
