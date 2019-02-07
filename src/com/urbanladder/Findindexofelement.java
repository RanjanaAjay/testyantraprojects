package com.urbanladder;

import java.util.Arrays;
import java.util.Scanner;

public class Findindexofelement {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[]array=new int[n];
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Enter the "+(i+1)+" number");
			array[i]=sc.nextInt();
		}
		System.out.println("array is \n"+Arrays.toString(array));
//		for(int element:array)
//		{
//			System.out.println(element);
//		}
		
		System.out.println("Enter the number to check index");
		int check=sc.nextInt();
		
		
		;
		 System.out.println("Index position of number "+check+ " is  " + findIndex(array, check));

		
	}
	
	
	 public static int  findIndex (int[] my_array, int t) 
	 {
	        if (my_array == null) 
	        {
	        	return -1;
	        }
	        int len = my_array.length;
	        int i = 0;
	       for(i=0;i<len;i++)
	       {
	            if (my_array[i] == t)
	            	
	            {
	            	return i;
	            }
	           
	            
	           
	       }
		return -1;
	       
	       

}
}
