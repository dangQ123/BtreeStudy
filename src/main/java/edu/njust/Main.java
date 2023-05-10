package edu.njust;

import edu.njust.btree.BtreeNode;

public class Main {

    public static void main(String[] args) {
        BtreeNode node = new BtreeNode(3);
        node = node.insert(3);
        node = node.insert(24);
        node = node.insert(37);
        node = node.insert(45);
        node = node.insert(50);
        node = node.insert(53);
        node = node.insert(61);
        node = node.insert(90);
        node = node.insert(100);
        node = node.insert(70);
        System.out.println("--------原树：---------");
        node.print();
        System.out.println("--------删除50后：---------");
        node = node.delete(50);
        node.print();
        System.out.println("--------删除53后：---------");
        node = node.delete(53);
        node.print();
        System.out.println("--------删除37后：---------");
        node = node.delete(37);
        node.print();
    }

}
