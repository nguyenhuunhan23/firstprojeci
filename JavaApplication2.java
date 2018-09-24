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
        File f = new File("data.txt"); // data
        BufferedReader br = null;
        int counter = 0; // counter to count number of students

        try {
            br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) { // read line by line
                System.out.println("Hello World I am " + line); // print name after reading line
                ++counter;
            }
        } catch (Exception e) {
            e.printStackTrace(); // file not found , null pointer , tec
        } finally {
            if (br != null) {
                br.close(); // close when finish reading
            }
        }
        System.out.println("Total " + counter + " Students");

    }

}
