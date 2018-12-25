package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("C:/plain.txt");
            int i=0;
            while(i != -1){
                i = reader.read();
                System.out.println((char) i );
            }
        } catch (IOException e) {
            System.out.println("File cannot be found.");
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("File cannot be found.");
                }
            }
            System.out.println("--- File End ---");
        }
    }
}
