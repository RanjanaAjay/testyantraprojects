package com.urbanladder;

import java.util.Scanner;

public class Secondhalfreversearray {
	public static void main(String args[])
	   {
		int counter, i=0, j=0, temp;
		int number[] = new int[100];
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many elements you want to enter: ");
		counter = scanner.nextInt();
	
		for(i=0; i<counter; i++)
		{
		    System.out.print("Enter Array Element"+(i+1)+": ");
		    number[i] = scanner.nextInt();
		}

		j = i/2;     
		i = i-1;         
		scanner.close();
		while(j<i)
		{
	  	   temp = number[i];
		   number[i] = number[j];
		   number[j] = temp;
		   j++;
		   i--;
		}

		System.out.print("Reversed array: ");
		for(i=0; i<counter; i++)
		{
		   System.out.print(number[i]+ "  ");
		}       
	   }
	}