/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhan Nguyen
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Hello World This is TDTU");
        int counter = 0; // counter to count number of students

        try {
            RandomAccessFile file = new RandomAccessFile("data.txt", "r");
            String str;
            while ((str = file.readLine()) != null) {
                ++counter;
                System.out.println("Hello I am " + str);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total " + counter + " Students");

    }

}
