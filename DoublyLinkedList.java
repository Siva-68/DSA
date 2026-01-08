import java.util.*;

public class Main{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtStart(10);
        list.insertAtEnd(20);
        list.insertAtStart(5);
        list.insertAtEnd(30);
        list.display();
        int no = list.count();
        System.out.println("\n The no of elements is "+ no);
        list.delete();
        int no1= list.count();
        System.out.println("\n The no of elements is "+ no1);
        list.display();

    }
}

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev= this.next = null;
    }
}
class DoublyLinkedList{

    Node head ;
    DoublyLinkedList(){
        head = null;
    }

    void insertAtStart(int value){
        Node newNode = new Node(value);
        if(head ==null){
            head = newNode;
            return ;
        }
        head.prev = newNode ;
        newNode.next = head;
        head = newNode;

    }

    void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head ;
        while(temp.next != null){
            temp = temp.next;
        }
        newNode.prev = temp ;
        temp.next = newNode; 
    }

    void delete(){
        if(head== null){
            System.out.println("The list is empty");
            return ;
        }
        if(head.next == null){
            head = null;
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;

    }


    void display(){
        if(head == null){
            System.out.println("The list is empty");
            return ;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    int count(){
        if(head == null) return -1;
        Node temp = head;
        int count=0;
        while(temp!= null){
            count ++;
            temp= temp.next;
        }
        return count;
    }


}