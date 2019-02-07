package com.urbanladder;

import java.util.HashMap;
import java.util.Scanner;

public class Frepeatedfnonrepeatedchar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =sc.nextLine();
		firstRepeatedNonRepeatedChar(str);
	}
	static void firstRepeatedNonRepeatedChar(String inputStr)
	{
		HashMap<Character, Integer> charCountmap=new HashMap<Character, Integer>();
		char[] strArray = inputStr.toCharArray();
		//System.out.println("charArray is "+charArray);
		for(char c:strArray)
		{
			if(charCountmap.containsKey(c))
			{
				charCountmap.put(c,charCountmap.get(c)+1);
			}
			else
			{
				charCountmap.put(c, 1);
			}
		}
		//checking for first non-repeated charcter
		for(char c:strArray)
		{
			if(charCountmap.get(c)==1)
			{
				System.out.println("First Non Repeated Character in " +inputStr+" is "+c+"  ");
				break;
			}
		}
		//checking for first repeated character
		for(char c:strArray)
		{
			if(charCountmap.get(c)>1)
			{
				System.out.println("first repeated character in "+inputStr+" is "+c+"  ");
				break;
				
			}
		}
	}

}
