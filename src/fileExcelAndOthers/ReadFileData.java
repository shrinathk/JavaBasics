package fileExcelAndOthers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Neetu\\eclipse-workspace\\Javabasics\\src\\parameterization\\object.properties");
		// The above line can also be written like this: This is to make sure that the directory is picked correctly even if it is not local system
		// FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\parameterization\\object.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
		//System.out.println(prop);
		


	}

}
