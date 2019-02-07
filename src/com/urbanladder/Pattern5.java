package com.urbanladder;

public class Pattern5 {
	public static void main(String[] args) {
		int i,j,k;
		char a='A';
		 for ( i = 1; i <= 4; i++)
	        {
	            int n = 4;
	 
	            for ( j = 1; j <= n - i; j++)
	            {
	                System.out.print(" ");
	            }
	            for ( k = i; k >= 1; k--)
	            {
	            	if(i==k || k<i)
	                System.out.print(a);
	            }
	            for (int l = 2; l <= i; l++)
	            {
	                System.out.print(a);
	            }
	 a=(char) (a+2);
	 
	            System.out.println();
	        }

}
}