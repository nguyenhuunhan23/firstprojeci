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
    public static List<String> readFileInList(String fileName) throws IOException {

        List<String> lines = Collections.emptyList();
        lines
                = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); // do something
        return lines;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Hello World This is TDTU");
        int counter = 0; // counter to count number of students

        List l = readFileInList("data.txt");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            ++counter;
            System.out.println("Hello World I am " + itr.next());
        }
        System.out.println("Total " + counter + " Students");

    }

}
