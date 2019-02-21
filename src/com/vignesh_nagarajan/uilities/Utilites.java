package com.vignesh_nagarajan.uilities;

import java.util.Scanner;

public  class Utilites {
	public static String getConsoleStringInput() {
		String inputString="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input string");
		inputString=scanner.nextLine();
		return inputString;
	}
}
