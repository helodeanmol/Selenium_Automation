package javaPackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Jan");
		ht.put(2, "Feb");
		ht.put(3, "Mar");

		System.out.println(ht.get(1)); // Jan
		System.out.println(ht.get(2)); // Feb
		System.out.println(ht.get(3)); // Mar
		System.out.println(ht);

	}

}
