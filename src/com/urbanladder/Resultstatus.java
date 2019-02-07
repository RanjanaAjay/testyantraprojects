package com.urbanladder;

import java.util.Scanner;

public class Resultstatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = null;
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=sc.nextInt();
		if(marks<35)
		{
			System.out.println("Result is Fail");
		}
		else if(marks>=35 && marks<=50)
		{
			System.out.println("Result is Second class- Pass");
		}
		else if(marks>50 && marks<80)
		{
			System.out.println("Result is first class");
		}
		else if (marks>=80 && marks<=100)
		{
			System.out.println("Result is Distinction");
		}
		else
		{
			System.out.println("Invalid marks");
		}
			
	}

}
