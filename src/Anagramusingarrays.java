import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagramusingarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "listen";
		String b = "silent";
		
		//String[] e = {};
		//String[] f = {};
		
		char[] c = new char[6] ;
		char[] d = new char[6];
		
		c = a.toCharArray();
		d = b.toCharArray();
		
//		System.out.println(c);
//		System.out.println(d);
		
		//Collections.sort(c);
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println(c);
		System.out.println(d);
		System.out.println(Arrays.equals(c, d));
		
		
	}

}
