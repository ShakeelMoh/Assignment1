package Assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchIt {

    public static void main(String[] args) {

        //Time program execution
        long start = System.currentTimeMillis();

        PrintIt.FillTree(); //Load data into bst

        BT bt = new BT();
        ReadData r = new ReadData();
        r.read();

        try {

            //Read data from query file
            Scanner sc = new Scanner(new File("/home/shakeel/NetBeansProjects/Assignment1/data/RandomNames/5Names"));

            String searchTerm;

            //Format data into tabular format
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

        //Time program execution
        long end = System.currentTimeMillis();
        long totalTime = end - start;

        System.out.println();
        System.out.println("Time taken: " + totalTime + "ms");

    }

}
