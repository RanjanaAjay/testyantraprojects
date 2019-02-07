package com.urbanladder;

import java.util.Scanner;

public class Swapstring {
	    public static void main(String[] args) {
	   	 // TODO Auto-generated method stub
	   	 System.out.println("Enter first string");
	   	 Scanner sc=new Scanner(System.in);
	   	 String a=sc.nextLine();
	   	 
	   	 System.out.println("Enter second string");
	   	 String b=sc.nextLine();
	   	 

	   	 a = a + b;
	   	 b = a.substring(0, (a.length() - b.length()));
	   	 a = a.substring(b.length());

	   	 System.out.println("string1 =" + a);
	   	 System.out.println("string2 =" + b);
	    }
	    }



