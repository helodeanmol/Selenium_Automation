package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {

		int a = 300; // local variable
		int b = 300; // local variable

		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a and b are equal");
		}

		String p = "Hello SElenium";
		String q = "Hello Selenium";

		// String Comparison - 1st way is not correct
		// We use == for number comparison - Case sensitive
		if (p == q) {
			System.out.println("p and q are equal for 1st way");
		} else {
			System.out.println("p and q are not equal for 1st way");
		}

		// String comparison - 2nd way is not appropriate - Case sensitive
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		} else {
			System.out.println("p and q are not equal for 2nd way");
		}

		// String comparison - 3rd way is correct - Not case sensitive
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		} else {
			System.out.println("p and q are not equal for 3rrd way");
		}

	}

}
