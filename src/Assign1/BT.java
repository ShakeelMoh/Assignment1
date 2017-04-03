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
public class BT {

    private BTNode root;
    

    BTNode node = new BTNode();

    /* Constructor */
    public BT() {

        root = null;

    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {

        return root == null;

    }

    /* Function to insert data recursively */
    public void insert(BTNode node, Data d) {
        BTNode newNode = new BTNode(d);
        if (root == null) {
            root = newNode;
            return;
        }
        BTNode current = root;
        BTNode parent = null;

        while (true) {
            parent = current;
            if (d.getName().compareTo(current.getName()) < 0) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    //Search bst for specific name
    
    public boolean find(BTNode r, String name) {

        
        if (r.getName().equals(name)) {
            System.out.println(r.getData());
            return true;
        } else if (r.getName().compareTo(name) > 0) {

            if (r.left != null) {
                return find(r.left, name);
            }

        } else {
            if (r.right != null) {
                return find(r.right, name);
            }

        }
        System.out.println(name + ": Not found\n");
        return false;
    }

    //Print bst in inorder fashion
    public void inorder() {

        inorder(root);
    }

    public void inorder(BTNode r) {

        if (r != null) {

            inorder(r.getLeft());

            System.out.print(r.getData() + "\n");

            inorder(r.getRight());

        }

    }

    //Return root of bst
    public BTNode getRoot() {
        return root;
    }

}

//    public boolean search(BTNode r, String name) {
//
//        if (r.getName().equals(name)) {
//
//            System.out.println(r.getData());
//            return true;
//        }
//
//        if (r.getLeft() != null) {
//            if (search(r.getLeft(), name)) {
//                return true;
//
//            }
//        }
//
//        if (r.getRight() != null) {
//            if (search(r.getRight(), name)) {
//                return true;
//            }
//        }
//
//        return false;
//
//    }
