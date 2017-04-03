package Assign1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shakeel
 */

//CLASS USED TO PRINT DIRECTORY
public class PrintIt {

    static BTNode btn;
    static BT bt;

    //FILLS THE BSD WITH ALL THE ENTRIES
    public static void FillTree() {

        
        Data d;
        bt = new BT(); //Root becomes null
        
        //Reads the data line by line from the text file
        ReadData r = new ReadData();
        r.read();
        
        
        for (int i = 0; i < r.getListName().size(); i++) {

            
            d = new Data();
            btn = new BTNode();

            d.name = r.getListName().get(i);
            d.number = r.getListNumber().get(i);
            d.address = r.getListAddress().get(i);

            btn.setName(d.getName());
            btn.setNumber(d.getNumber());
            btn.setAddress(d.getAddress());

            bt.insert(btn, d);

        }
        
        System.out.println("Tree Filled");

    }

    public void print() {
        //Method to print directory to screen using inorder
        System.out.println("Binary Tree Telephone Directory\n");

        bt.inorder(bt.getRoot());

    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        
        PrintIt p = new PrintIt();
        p.FillTree();
        p.print();
        
        long end = System.currentTimeMillis();
        long totalTime = end - start;
        
        System.out.println("Time taken: " + totalTime + "ms");

    }

}
