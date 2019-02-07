package com.urbanladder;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j,k=5;
		int l=4;
		int p=0;
		for(i=0;i<5;i++) 
		{
			for(j=0;j<5;j++) {
					if(i==j || (j==l && i==p))
					{
						System.out.print(k);
						
					}
					else
						System.out.print(" ");
							}k--;
							l--;
							p++;
			System.out.println();
			
		}
			
			
			
		}

	}

