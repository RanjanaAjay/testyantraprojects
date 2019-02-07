package com.urbanladder;

import java.util.Arrays;
import java.util.Scanner;

public class Indexofelement {
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
		
		for(int index=array.length;index>0;index--)
		{
			if(index%2!=0) 
			{
				System.out.println("no is "+array[index]+" and index is  "+index);
			}
		}
	}
	
	

}
