package javaPackage;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = scn.nextLine();
		scn.close();
		
		if (s.charAt(0)==s.charAt(s.length()-1)) {
			System.out.println("Given first and Last charater are same");
		} else {
			System.out.println("Given first and Last charater are not same");
		}

	}

}
