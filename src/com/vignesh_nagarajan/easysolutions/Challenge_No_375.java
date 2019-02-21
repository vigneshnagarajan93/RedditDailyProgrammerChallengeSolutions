package com.vignesh_nagarajan.easysolutions;

import javax.swing.text.Utilities;

public class Challenge_No_375 {
 
	/* Problem statement:
	 * A number is input in computer then a new no should get printed by adding one to each of its digit. If you encounter a 9, insert a 10 (don't carry over, just shift things around).
	   For example, 998 becomes 10109.
	 * */
	public static void main(String[] args) {
		String inputString=Utilities.getConsoleStringInput();
		for(int i=0;i<inputString.length();i++) {
			int processNum=Character.digit(inputString.charAt(i), 10);
			System.out.print(++processNum);
		}
	}

}
