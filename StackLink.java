import java.util.*;

public class Main{
    public static void main(String[] args){
        StackLink stack = new StackLink();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int a = stack.peek();
        System.out.println("The peek value is "+ a);
        int b = stack.pop();
        System.out.println("The poped value is "+a);
        stack.display();
    }
}

class Node{
    int data ;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}
class StackLink{

    Node top ;
    
    // Constructing the stacklink
    StackLink(){
        top= null;
    }
    // Adding new elememts to the stack
    void push(int value){
        Node newNode =  new Node(value);
        newNode.next= top;
        top = newNode;
        System.out.println("The pushed value is "+value);
    }

    // Removing elements from the stack
    int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
       
        int data = top.data;
        top = top.next;
        return data;

    }

    // Displaying the elements of stack
    void display(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return ;
        }
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp= temp.next;
        }System.out.println("Null");

    }

    // Showing the top element of the stack
    int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return top.data;
    }

    // Checking for empty
    Boolean isEmpty(){
        return top==null;
    }
}