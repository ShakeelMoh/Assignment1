/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign1;

/**
 *
 * @author shakeel
 */
public class BTNode {

    BTNode left;
    BTNode right;

    String address;
    String name;
    String number;
   


    public BTNode() {


    }

    public BTNode(Data d) {

        left = null;
        right = null;

        name = d.getName();
        number = d.getNumber();
        address = d.getAddress();

    }
    
    

    public BTNode getLeft() {

        return left;

    }

    /* Function to get right node */
    public BTNode getRight() {

        return right;

    }

    public String getData() {
        
        System.out.format("|%-30s   |%-30s   |%-55s   |", name, number, address, "");
        return "";
        //String output = name + "\t\t" + number + "\t\t" + address;
        //return output;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

 
    

}
