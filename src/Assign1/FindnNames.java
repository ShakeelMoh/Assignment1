/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shakeel
 */
public class FindnNames {
    
    public static void main(String[] args) {
        
        ReadData r = new ReadData();
        Random ran = new Random();
        r.read();
        
        
        System.out.println("How many names do you want?");
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
       
        
        //Choose how many random names you would like to print for the experiment
        for (int i = 0; i < count; i++) {
            
            String output = r.getListName().get(ran.nextInt(10000)) + "";
            System.out.println(output);
            
            
        }
        
        
        
        
       
        
        
    }
    
}
