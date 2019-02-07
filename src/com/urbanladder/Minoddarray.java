package com.urbanladder;

public class Minoddarray{
	//int min=0;
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int mineven=0, minodd=0;
        Minoddarray ob=new Minoddarray();
        // Loop to find even, odd sum 
        for (int i = 0; i < arr.length; i++) { 
        	 if (i % 2 != 0) 
        	 {
        		 minodd=ob.minval(arr[i],arr[1]);
                         } 
        }
        
          System.out.println("Odd min value : " + minodd); 
          
          for (int i = 0; i < arr.length; i++) { 
         	 if (i % 2 == 0) 
         	 {
         		 mineven=ob.minval(arr[i],arr[0]);
                          } 
         }
         
           System.out.println("min even : " + mineven);   
        
    } 
		 public int minval(int x,int min) {
		 int y=min;
		 if(x<y)
			 min=x;
		 else 
			 min=y;
		 return min;
	 }
} 
