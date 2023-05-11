package edu.njust;

import edu.njust.btree.BtreeNode;

public class Main {

    public static void main(String[] args) {
        // root 作为树根
        BtreeNode root = new BtreeNode(3);
        root = root.insert(3);
        root = root.insert(24);
        root = root.insert(37);
        root = root.insert(45);
        root = root.insert(50);
        root = root.insert(53);
        root = root.insert(61);
        root = root.insert(90);
        root = root.insert(100);
        root = root.insert(70);
        System.out.println("--------原树：---------");
        root.print();
        System.out.println("--------删除50后：---------");
        root = root.delete(50);
        root.print();
        System.out.println("--------删除53后：---------");
        root = root.delete(53);
        root.print();
        System.out.println("--------删除37后：---------");
        root = root.delete(37);
        root.print();
    }

}
