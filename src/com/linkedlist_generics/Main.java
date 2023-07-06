package com.linkedlist_generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome Data Structure Problems using Java Generics Project.");

        LinkedListGenerics<Integer> lgList = new LinkedListGenerics<Integer>();

        lgList.pushValue(70);
        lgList.pushValue(56);

        lgList.displayList();

        lgList.insertValue(30,56);
        lgList.displayList();

        lgList.displayList();
        lgList.searchNum(30);

        lgList.insertValue(40,30);
        lgList.displayList();

        lgList.searchAnddeleteNum(40);
        lgList.displayList();
    }
}
