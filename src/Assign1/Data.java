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

//STORES 3 ITEMS OF DATA PER ENTRY
public class Data {

    String name;
    String number;
    String address;

    public Data(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;

    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
