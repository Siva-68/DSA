import java.util.*;

public class Main{
    public static void main(String[] args){
        QueueArray queue = new QueueArray(10);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        int a = queue.peek();
        int b = queue.deQueue();
        queue.display();
        System.out.println(a+" "+b);

    }
}
class QueueArray{
    int front;
    int rear;
    int[] arr;
    int capacity;

    // Constructor
    QueueArray(int size){
        capacity = size;
        arr = new int[capacity];
        front= -1;
        rear = -1;
    }

    // Adding values to the queue 
    void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is empty");
            return ;
        }
        if(isEmpty()){
            front=0;
        }
        arr[++rear]= value;
        System.out.println("The element Enqueued is "+value);
        
    }

    // Removing elements from the queue 
    int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }

        int removedValue = arr[front];
        if(rear==front){
            front=rear =-1;
        }
        else{
            front++;
        };
        return removedValue;

    }

    // Displaying the elements of queue
    void display(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return ;
        }
        System.out.println("The elements of the queue are ")
        for(int i = front ; i <= rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Returning the peek value of the queue
    int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1 ;
        }
        return arr[front];
    }

    // Checking wheather the queue is full or not
    Boolean isFull(){
        return rear == capacity-1;
    }

    // Cheking wheather the queue is empty or not 
    Boolean isEmpty(){
        return front==-1 && rear ==-1;
    }
}