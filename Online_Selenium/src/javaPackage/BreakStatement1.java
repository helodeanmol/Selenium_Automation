package javaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			// if statement
			if (i == 5) {
				break; // breaking the loop
			}
			System.out.println(i);
		}
		System.out.println("Control came out from loop");

	}

}
