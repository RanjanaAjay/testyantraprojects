package com.urbanladder;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;

	public class Swapindexinarray {
		 public static void main(String[] args)
		    {
		        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
		         
		        System.out.println(list);
		         
		        Collections.swap(list, 2, 3);
		         
		        System.out.println(list);
		    }
		}
