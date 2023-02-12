package javaPackage;

public class BreakStatement4 {

	public static void main(String[] args) {

		int i = 1; // local variable

		// do while loop
		do {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
