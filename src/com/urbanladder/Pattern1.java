package com.urbanladder;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,k;
		 for ( i = 1; i <= 4; i++)
	        {
	            int n = 4;
	 
	            for ( j = 1; j <= n - i; j++)
	            {
	                System.out.print(" ");
	            }
	            for ( k = i; k >= 1; k--)
	            {
	                System.out.print(k);
	            }
	            for (int l = 2; l <= i; l++)
	            {
	                System.out.print(l);
	            }
	 
	            System.out.println();
	        }

}
}
