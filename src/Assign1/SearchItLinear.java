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

    private static ArrayList<String> address;
    private static ArrayList<String> names;
    private static ArrayList<String> number;

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ReadData r = new ReadData();
        r.read();

        address = r.getListAddress();
        names = r.getListName();
        number = r.getListNumber();

        try {

            //Reads data from query file
            Scanner sc = new Scanner(new File("/home/shakeel/NetBeansProjects/Assignment1/data/RandomNames/5Names"));

            String searchTerm;
            boolean flag;

            System.out.println("Searching query file using linear algorithm...\n\nResults:\n");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|Name\t\t\t\t  |Number\t\t\t    |Address\t\t\t\t\t\t       |");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
            while (sc.hasNext()) {

                searchTerm = sc.nextLine();
                flag = false;

                for (int i = 0; i < names.size(); i++) {

                    if (searchTerm.equals(names.get(i))) {
                        flag = true;

                        System.out.format("|%-30s   |%-30s   |%-55s   |\n", names.get(i), number.get(i), address.get(i), "");
                        //String output = address.get(i) + " | " + number.get(i) + " | " + names.get(i);

                        //System.out.println(output);
                    }

                }

                if (flag == false) {
                    System.out.println("Not found");
                }
            }

            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItLinear.class.getName()).log(Level.SEVERE, null, ex);
        }

        long end = System.currentTimeMillis();
        long totalTime = end - start;

        System.out.println("\nTime taken: " + totalTime + "ms");

    }

}
