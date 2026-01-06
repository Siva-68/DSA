import java.util.*;

public class Main{
    public static void main(String[] args){
        QueueLink queue= new QueueLink();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.peek();
        queue.display();
        queue.deQueue();
        queue.display();

    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class QueueLink{
    Node front, rear;

    QueueLink(){
        front = rear = null;
    }

    void enQueue(int value){
        Node newNode = new Node(value);
        if(front == null){
            front= rear = newNode;
            System.out.println(value + " is enqueued.");
            return ;
        }
        rear.next = newNode;
        rear= newNode;
        System.out.println(value + " is enqueued.");
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty.");
            return ;
        }
        int data = front.data;
        front= front.next;
        System.out.println(data +" is dequeued.");
    }

    void peek(){
        if(isEmpty()){
            System.out.println("The queue is empty.");
            return ;
        }
        System.out.println("The peek element is "+ front.data);
    }

    void display(){
        if(isEmpty()){
            System.out.println("The queue is empty.");
            return ;
        }
        Node temp = front;
        System.out.println("The queue elements are \n");
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp =temp.next;
        }
        System.out.println("Null");
    }

    Boolean isEmpty(){
        return front == null;
    }
}

