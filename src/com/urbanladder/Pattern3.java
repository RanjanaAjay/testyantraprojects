package com.urbanladder;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,k,l;
		for ( i = 1; i <= 4; i++)
        {
            int n = 4;
 
            for ( j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for ( k = i; k >= 1; k--)
            {
            	if(i==k)
                System.out.print(k);
            	else
            		System.out.print(" ");
            }
            for (l = 2; l <= i; l++)
            {
            	if(i==l)
                System.out.print(l);
            	else
            		System.out.print(" ");
            }
            System.out.println();
        }
}
}
