package javaPackage;

import java.sql.Timestamp;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
	
		//Date d = new Date();
		//Timestamp ts = new Timestamp(d.getTime());
		/*
		 * Timestamp ts = new Timestamp(System.currentTimeMillis()); Date d = new
		 * Date(ts.getTime()); System.out.println(ts); String name = "Anmol Helode"; int
		 * no = name.replaceAll(" ", "").length(); System.out.println(no);
		 */
		
		String s = "ANMOL";
//		StringBuffer buffer = new StringBuffer(s);
//		buffer.reverse();
//		String data = buffer.toString();
//		System.out.println(data);
//		if (s.equals(data)) {
//			System.out.println("Given string is palindrome ");
//		} else {
//			System.out.println("Givern string is not palimdrome");
//		}
		for ( int i=s.length()-1; i>=0; i--) {
			if (i>=0) {
			System.out.print(s.charAt(i));
			}
		}
	}

}
