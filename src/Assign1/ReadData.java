/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shakeel
 */
public class ReadData {
    
    
    private static ArrayList<String> address;
    private static ArrayList<String> name;
    private static ArrayList<String> number;

    public void read(){

        address = new ArrayList<>();
        name = new ArrayList<>();
        number = new ArrayList<>();

        try {
            
            //Read data from textfile
            Scanner sc = new Scanner(new File("/home/shakeel/NetBeansProjects/Assignment1/data/testdata"));

            

            while (sc.hasNextLine()) {

                String s = sc.nextLine();

                String[] line = s.split("\\|");

                address.add(line[0]);
                number.add(line[1]);
                name.add(line[2]);

                
            }
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public ArrayList<String> getListAddress(){
        return address;
        
    }
    public ArrayList<String> getListName(){
        return name;
        
    }
    public ArrayList<String> getListNumber(){
        return number;
        
    }

//    public static ArrayList<String> getAddress() {
//        return address;
//    }
//
//    public static ArrayList<String> getName() {
//        return name;
//    }
//
//    public static ArrayList<String> getNumber() {
//        return number;
//    }

}
