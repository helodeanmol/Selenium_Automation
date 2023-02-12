package javaPackage;

public class Variable1 {

	public static void main(String[] args) {

		// int is primitive data type, a is variable name, 5 is variable value
		int a = 5; // integer type local variable
		System.out.println(a); // 5

		int x = 100; // integer type local variable
		System.out.println(x); // 100

		x = 200; // integer type local variable
		System.out.println(x); // 200

		char c = 'a'; // char type local variable, should be placed inside single quote
		System.out.println(c); // a

		boolean b = true;
		System.out.println(b); // true

		System.out.println(3 > 12); // false

		int e = 100; // integer type local variable
		int f = 200; // integer type local variable

		boolean z = e > f; // boolean type local variable
		System.out.println(z); // false

	}

}
