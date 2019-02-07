package com.urbanladder;

import java.util.Scanner;

public class Percentage {
	 public static void main(String args[]) {
		 
	  //    String data = "Hello HOW are you MR 51";
		 System.out.println("Enter first srting");
	    	Scanner sc=new Scanner(System.in);
	    	String data=sc.nextLine();
	    	
	      char [] charArray = data.toCharArray();
	      int upper = 0;
	      int lower = 0;
	      int digit = 0;
	      int others = 0;

	      int totalChars = data.length();
	      for(int i=0; i<data.length(); i++) {
	         if (Character.isUpperCase(charArray[i])) {
	            upper++;
	         } else if(Character.isLowerCase(charArray[i])) {
	            lower++;
	         } else if(Character.isDigit(charArray[i])){
	            digit++;
	         } else {
	            others++;
	         }
	      }
	      System.out.println("Total length of the string :"+totalChars);
	      System.out.println("Upper case :"+upper);
	      System.out.println("Percentage of upper case letters: "+(upper*100)/totalChars);
	      System.out.println("Lower case :"+lower);
	      System.out.println("Percentage of lower case letters:"+(lower*100)/totalChars);
	      System.out.println("Digit :"+digit);
	      System.out.println("Percentage of digits :"+(digit*100)/totalChars);
	      System.out.println("Others :"+others);
	      System.out.println("Percentage of other characters :"+(others*100)/totalChars);
	   }
	}