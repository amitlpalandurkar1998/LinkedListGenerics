package com.linkedlist_generics;

public class LinkedListGenerics<I> {
    Node head;
    void pushValue(I data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void displayList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
}
