package com.svn.test;

public class Service {
	
	public String reverseString(String str) {
		int length = str.length();
		
		String rev="";
		for(int i=length-1;i>=0;i--)
			  rev=rev+str.charAt(i);
		//System.out.println("Reversed String :: "+rev);
		return rev.trim();
	}

}
