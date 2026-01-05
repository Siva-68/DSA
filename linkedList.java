import java.util.*;


public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
    }
}
// Node syntax declaration  

class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

// Linked List structure and functions 

class LinkedList{
    Node head; 

        // Adding an element at the beginning
    void addAtStart(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode ;
            return ;
        }

        newNode.next = head ;
        head = newNode;
    }

         // Adding an element at the end

    void addAtEnd(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode ;
            return ;
        }
         
        Node temp = head ;
        while(temp.next!= null){
            temp = temp.next ;
        } 
        temp.next= newNode;
    }

    //    Adding an element by index 

    void add(int data , int posi ){
        Node newNode = new Node(data);
        int count =0;

        if(posi == 1){
            newNode. next = head;
            head  = newNode;
            return ;
        }

        Node temp = head;
        while(temp != null && count< posi-1){
            temp = temp.next ;
            count++;
        }
        if(temp ==null){
            System.out.println("Invalid position");
            return ;
        }
        
        newNode.next = temp.next;
        temp.next = newNode ;

    }

    //  Delete element at Start 
    int deleteAtStart(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return -1;
        }

        int a = head.data ;
        head = head.next ;
        return a;
    }

    //  Delete element at End 

    int deleteAtEnd(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return -1;
        }
        
        if(head.next == null){
            int a = head.data;
            head= null;
            return a;
        }

        Node temp = head ;
        while(temp.next.next != null){
            temp = temp.next ;
        }

        Node temp1 = temp.next ;
        int a = temp1.data;
        temp.next = null;
        return a;
    }

    //   Delete Element 
    int deleteByValue(int value){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return -1;
        }
        Node temp = head ;
        while(temp.next != null && temp.data != value){
            temp = temp.next ;
        }
        if(temp == null){
            System.out.println("No such value !");
            return -1;
        }
        int d = temp.next.data;
        temp.next = temp.next.next ;
        return d ;
    }

    // Display the elements of the List 

    void display(){

        Node temp = head;
        if(!isEmpty()){
            while(temp!= null){
                System.out.print(temp.data + " -> ");
                temp = temp.next ;
            }
        }
        System.out.print("null");
    }

    // Counting the number of elements in the list 

    int count(){

        Node temp =head;
        int c =0 ;
        if(isEmpty()){
            System.out.println("No elements found in the List");
            return c;
        }
        while(temp!= null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    // Reversing the list 

    void reverse(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return ;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current ;
            current= next ;
        }
        head = prev;

    }
    //  Checking weather the LL is empty or not 
    boolean isEmpty(){
        return head == null;
    }
}

