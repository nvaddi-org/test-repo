package com.svn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SVNTest {

	public static void main(String[] args) {
		
		Service service = new Service();
		String rev = service.reverseString("Engineer");
		System.out.println("Reversed String :: "+rev);
		//assertEquals("String Reversed Successfully","reenignE", service.reverseString("Engineer"));
		if ("reenignE".equals(rev))
			System.out.println("String Reversed Successfully");
		else
			System.out.println("String Reverse Failed");

	}

}
