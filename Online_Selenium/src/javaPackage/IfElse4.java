package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {

		int age = 25; // local variable
		int weight = 50; // local variable

		// Outer if block
		if (age > 18) {

			// inner if block
			if (weight > 50) {
				System.out.println("Eliigible for blood donation");
			} else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}

	}

}
