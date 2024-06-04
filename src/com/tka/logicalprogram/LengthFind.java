package com.tka.logicalprogram;

public class LengthFind {

	public static void main(String[] args) {
		String name = "Shubham";
		int count = 0;
		int concount=0;
//		for (int i = 0; i < name.length(); i++) {
//			count++;
//		}
//		System.out.println("Length of string = " + count);

//	//Reverse of a string
//	for(int i=name.length()-1;i>=0;i--) {
//		System.out.print(name.charAt(i));
//	}
//	
//		// count Each charector
//		for (int i = 0; i < name.length(); i++) {
//			if (name.charAt(i) != ' ') {
//				count++;
//
//			}
//			
//		}
//		System.out.println("count of each charector : " + count);
//
			
	//count vovels 
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a'||name.charAt(i)=='i' || name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='e') {
			count++;
		}
		else  {
			concount++;
		}
		
	}
	
	System.out.println("Count number of vovels = "+count);
	System.out.println("count number of consonent = "+concount);
}
}
