package com.tka.string;

public class TestString {
	public static void main(String[] args) {

		StringOperation operation = new StringOperation();
		// Calculate given length of the string
		String str = "Shubham Mahajan";
		int length = operation.calculateLength(str);
		System.out.println("Length of " + str + " is = " + length);

		// Specific charector of given string

		char charector = operation.charectorOfString(str, 6);
		System.out.println("Specific charector of " + str + "is = " + charector);

		// SubString of a given string
		String string = operation.getSubString(str, 4, 6);
		System.out.println("Sub String of " + str + " is = " + string);

		// Trim char from the given string
		String t = operation.getTrim(str);
		System.out.println("Trim of String " + str + " is  = " + t);

		// UpperCase of the given string
		String u = operation.getUpperCase(str);
		System.out.println("To Upper case of " + str + "is = " + u);

		// lowerCase of given string
		String l = operation.getLowerCase(str);
		System.out.println("ToLowerCase of " + str + " is = " + l);

		// Replace of given string
		// String r=((StringOperation) operation).getReplaceString(str);
		// System.out.println("Replace of String "+str+" is = "+r);

	}

}
