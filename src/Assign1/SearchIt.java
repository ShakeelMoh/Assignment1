/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shakeel
 */
public class SearchIt {

    private static ArrayList<String> address;
    private static ArrayList<String> names;
    private static ArrayList<String> number;

    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();

//        if (PrintIt.bt.getRoot() != null){
//            System.out.println("tree not empty");
//        }
        PrintIt.FillTree(); //Load data into bst

        
        BT bt = new BT();
        ReadData r = new ReadData();
        r.read();

        try {

            //Read data from query file
            Scanner sc = new Scanner(new File("/home/shakeel/NetBeansProjects/Assignment1/data/RandomNames/5Names"));

            String searchTerm;

            System.out.println("Searching query file using BST algorithm...\n\nResults:\n");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|Name\t\t\t\t  |Number\t\t\t    |Address\t\t\t\t\t\t       |");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            while (sc.hasNext()) {

                searchTerm = sc.nextLine();

                bt.find(PrintIt.bt.getRoot(), searchTerm);

            }
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItLinear.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long end = System.currentTimeMillis();
        long totalTime = end - start;
        
        
        System.out.println();
        System.out.println("Time taken: " + totalTime + "ms");

    }

}
