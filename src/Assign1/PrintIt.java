package Assign1;

import java.util.Scanner;

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

            //Define btn as the current node
            btn = new BTNode();

            d.name = r.getListName().get(i);
            d.number = r.getListNumber().get(i);
            d.address = r.getListAddress().get(i);

            btn.setName(d.getName());
            btn.setNumber(d.getNumber());
            btn.setAddress(d.getAddress());

            //Insert function from bt class
            //Insert btn, the new node with all its contents
            bt.insert(btn, d);

        }

    }

    //Method to print directory to screen using inorder
    //Output is formatted to fit in a table
    //Creativity points??
    public void print() {

        System.out.println("Binary Tree Telephone Directory");
        System.out.println("-------------------------------\n");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|Name\t\t\t\t  |Number\t\t\t    |Address\t\t\t\t\t\t       |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

        //In order print method
        bt.inorder(bt.getRoot());
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

    }

    public static void main(String[] args) {

        //Timing program execution
        long start = System.currentTimeMillis();

        //Create new instance of printIt class to access fill tree method
        PrintIt p = new PrintIt();

        //Fill the bst
        p.FillTree();

        p.print();

        //Program execution time is printed
        long end = System.currentTimeMillis();
        long totalTime = end - start;

        System.out.println("Time taken: " + totalTime + "ms");

    }

}
