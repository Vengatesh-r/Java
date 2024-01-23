package com.basic.pkg;

public class String_sample {

	public static void main(String[] args) {
		String x = "Prakash is a good boy";
		//String y = "";

		System.out.println(x.replaceAll("Java", "phython"));
		System.out.println(x.replaceFirst("Java", "phython"));
		System.out.println(x.equals("phython"));

		// Overloaded method via change in number of parameter
		System.out.println(x.startsWith("A", 3));
		System.out.println(x.startsWith("A"));

		// Overloaded method via change in type of parameter
		System.out.println(x.replace('a', '@')); // char replace
		System.out.println(x.replace("Java", "python")); // String replace

		// Overloaded method via change in number of parameter
		System.out.println(x.substring(4));
		System.out.println(x.substring(4, 8));

	}

}