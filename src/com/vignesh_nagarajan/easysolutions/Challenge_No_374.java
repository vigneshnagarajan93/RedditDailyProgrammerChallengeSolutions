package com.vignesh_nagarajan.easysolutions;

import com.vignesh_nagarajan.uilities.Utilities;

public class Challenge_No_374 {
	 /*
	 * Problem: https://www.reddit.com/r/dailyprogrammer/comments/akv6z4/20190128_challenge_374_easy_additive_persistence/
	 * */
	static int persistanceCount=0;
	public static void main(String[] args) {
		String inputString=Utilities.getConsoleStringInput();
		computeAdditivePersistance(inputString);
		
	}
	public static void computeAdditivePersistance(String inputString) {
		Integer answer=0;
		
		if(inputString!=null) {
			if(inputString.length()>1) {
				for(int i=0;i<inputString.length();i++)
				{
					answer+=Character.digit(inputString.charAt(i), 10);
				}
				persistanceCount++;
				System.out.println("Answer:"+answer);
				computeAdditivePersistance(answer.toString());
			}
			if(inputString.length()==1) {
				System.out.println("Persistance Count:"+persistanceCount);
			}
		}
	}
}
