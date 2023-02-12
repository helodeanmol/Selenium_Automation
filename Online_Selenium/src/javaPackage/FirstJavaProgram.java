package javaPackage;

public class FirstJavaProgram {

	int a = 5; // global variable
	static int c = 10; // static variable

	// main method of main function - double slash is used to comment line
	// shortcut for main method - Type ma inside class body and press cntrl + space
	public static void main(String[] args) {

		System.out.println("Hello Selenium");
		System.out.println("Anmol");
		aMethod();
		bMethod();

	}

	// user defined static method
	public static void aMethod() {
		System.out.println("Hello A Method");

	}

	// user defined static method
	public static void bMethod() {
		System.out.println("Hello B Method");
		int b = 4; // local variable
	}

}
