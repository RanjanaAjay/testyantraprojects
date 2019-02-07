package com.urbanladder;

import java.io.FileReader;
import java.io.IOException;

public class Readafile {
	public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\TYSS\\Desktop\\sample.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}