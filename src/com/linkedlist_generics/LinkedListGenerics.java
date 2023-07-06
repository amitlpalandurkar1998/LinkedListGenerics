package com.linkedlist_generics;

public class LinkedListGenerics<I> {
    Node head;
    void pushValue(I data){//method use to add value in link list.
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void displayList(){//method use to print link list.
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
}
