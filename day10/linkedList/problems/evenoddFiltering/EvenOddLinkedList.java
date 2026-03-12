package DSA.linear.linkedList.problems.evenoddFiltering;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class EvenOddLinkedList {

    static Node head=null;

    static void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    static int countNodes(){
        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    static void printEven(){
        Node temp=head;

        while(temp!=null){
            if(temp.data % 2 == 0){
                System.out.print(temp.data + " ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    static void printOdd(){
        Node temp=head;

        while(temp!=null){
            if(temp.data % 2 != 0){
                System.out.print(temp.data + " ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n=sc.nextInt();

        System.out.println("Enter the node values:");

        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }

        System.out.println("Total number of nodes: " + countNodes());

        System.out.print("Even numbers: ");
        printEven();

        System.out.print("Odd numbers: ");
        printOdd();
    }
}