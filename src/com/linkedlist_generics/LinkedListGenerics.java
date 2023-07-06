package com.linkedlist_generics;

public class LinkedListGenerics {
    Node head;
    void pushValue(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
}
