package com.tka.string;

public class StringOperation {
	private CharSequence newChar;
	private CharSequence oldChar;

	public int calculateLength(String str) {
		int length = str.length();
		// System.out.println(str.length());
		return length;
	}

	public char charectorOfString(String str, int i) {
		char chr = str.charAt(i);
		return chr;
	}

	public String getSubString(String str, int beginIndex, int endIndex) {
		String subStr = str.substring(beginIndex, endIndex);
		return subStr;

	}

	public String getTrim(String str) {
		String trim = str.trim();
		return trim;
	}

	public String getUpperCase(String s) {
		String upper = s.toUpperCase();
		return upper;
	}

	public String getLowerCase(String l) {
		String lower = l.toLowerCase();
		return lower;
	}

	public String getReplaceString(String str) {
		str.replace(oldChar, newChar);
		return str;
	}

}
