package com.linkedlist_generics;

public class Node<I> {
    I data;
    Node next;
    Node(I data){
        this.data=data;
        this.next=null;
    }
}
