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
public class SearchItLinear {

    //Define 3 local array lists which will contain the data
    private static ArrayList<String> address;
    private static ArrayList<String> names;
    private static ArrayList<String> number;

    public static void main(String[] args) {

        //Time program execution
        long start = System.currentTimeMillis();

        ReadData r = new ReadData();
        r.read();

        //Fill local arraylists with data
        address = r.getListAddress();
        names = r.getListName();
        number = r.getListNumber();

        try {

            //Reads data from query file
            Scanner sc = new Scanner(new File("/home/shakeel/NetBeansProjects/Assignment1/data/RandomNames/5Names"));

            String searchTerm;
            boolean flag;

            //Data printed in tabular format
            System.out.println("Searching query file using linear algorithm...\n\nResults:\n");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|Name\t\t\t\t  |Number\t\t\t    |Address\t\t\t\t\t\t       |");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            while (sc.hasNext()) {

                searchTerm = sc.nextLine();
                flag = false;

                //Iterate through array list till name is found
                for (int i = 0; i < names.size(); i++) {

                    if (searchTerm.equals(names.get(i))) {
                        flag = true;

                        System.out.format("|%-30s   |%-30s   |%-55s   |\n", names.get(i), number.get(i), address.get(i), "");

                    }

                }

                //If no name is found for query
                if (flag == false) {
                    System.out.println("Not found");
                }
            }

            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItLinear.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Time program execution
        long end = System.currentTimeMillis();
        long totalTime = end - start;

        System.out.println("\nTime taken: " + totalTime + "ms");

    }

}
