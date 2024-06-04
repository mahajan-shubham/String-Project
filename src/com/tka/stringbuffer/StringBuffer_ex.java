package com.tka.stringbuffer;

public class StringBuffer_ex {

	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("ShubhamMahajan");
		//System.out.println(stringBuffer.append(false));
		
		System.out.println(stringBuffer.append(5));
		System.out.println(stringBuffer.append("khune"));
		System.out.println(stringBuffer.codePointAt(2 ));
		System.out.println(stringBuffer.capacity());

	}

}
