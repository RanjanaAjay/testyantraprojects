package com.urbanladder;

import java.util.Scanner;

public class Rotationstring {

	    /* Function checks if passed strings (str1 and str2) 
	       are rotations of each other */
	    static boolean areRotations(String str1, String str2) 
	    { 
	        // There lengths must be same and str2 must be  
	        // a substring of str1 concatenated with str1.   
	        return (str1.length() == str2.length()) && 
	               ((str1 + str1).indexOf(str2) != -1); 
	    } 
	      
	    // Driver method 
	    public static void main (String[] args) 
	    { 
	      //  String str1 = "AACD"; 
	     //   String str2 = "ACDA"; 
	    	System.out.println("Enter first srting");
	    	Scanner sc=new Scanner(System.in);
	    	String str1=sc.nextLine();
	    	System.out.println("Enter Second srting");
	    	String str2=sc.nextLine();
	  
	        if (areRotations(str1, str2)) 
	            System.out.println("Strings are rotations of each other"); 
	        else
	            System.out.printf("Strings are not rotations of each other"); 
	    } 
	}

