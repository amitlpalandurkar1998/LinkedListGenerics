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
    void insertValue(I data, I afterData) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(afterData)) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }

        System.out.println(afterData + " not found in the linked list.");
    }
    void deleteFirstNum(){//method use to delete First Number from linkList.
        if (head==null){
            System.out.println("data is null.");
            return;
        }
        I temp = (I) head.data;
        head = head.next;
    }
    void deleteLastNum(){
        if (head==null){
            System.out.println("data is null.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    void searchNum(I searchNumber){
        boolean isNotFound = true;
        if (head==null){
            System.out.println("data is null.");
            return ;
        }
        if (head.data==searchNumber){
            System.out.println(searchNumber+" is Present.");
            isNotFound=false;
        } else if (head.next.data==null) {
            System.out.println(searchNumber + " is Not Present.");
            exit();
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next.data == searchNumber) {
                    System.out.println(searchNumber + " is Present.");
                    isNotFound = false;
                    return;
                }
                temp = temp.next;
            }
            if (isNotFound) {
                System.out.println(searchNumber + " is Not Present.");
            }
        }
    }
    void searchAnddeleteNum(I deleteNum){
        boolean isNotFound = true;
        if (head==null){
            System.out.println("data is null.");
            return ;
        }
        Node temp = head;
        while (temp!=null){
            if (temp.next.data==deleteNum){
                I deleteData = (I) temp.next.data;
                temp.next = temp.next.next;
                isNotFound=false;
                return ;
            }
            temp = temp.next;
        }
        if (isNotFound){
            System.out.println("Not Present.");
        }
    }
    void displayList(){//method use to print link list.
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    void exit(){}
}
