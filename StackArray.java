import java.util.*;

public class Main{
    public static void main(String[] args ){
        StackArray Arr = new StackArray(10);
        Arr.push(10);
        Arr.push(20);
        Arr.push(30);
        Arr.peek();
        Arr.display();
        int a = Arr.pop();
        System.out.println(a);
    }
}

class StackArray{
    int top;
    int capacity;
    int arr[];
    
    // Checking the array is empty or not  
    Boolean isEmpty(){
        return top==-1;
    }

    // Checking the array is full or not
    Boolean isFull(){
        return top == capacity-1;
    }

    // Initializing the array
    StackArray(int size){
        capacity= size;
        top = -1;
        arr = new int[capacity];
    }

    // Adding the element to the array
    void push(int value){
        if(isFull()){
            System.out.println("The stack is full !");
            return ;
        }
        arr[++top]= value;
        System.out.println("The element pushed is "+ value );
    }

    // Removing the element from the array
    int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty !");
            return -1;
        }
        return arr[top--];
    }

    // Showing the peek element
    void peek(){
        if(isEmpty()){
            System.out.println("The stack is empty !");
            return ;
        }
        System.out.println("The peek element is "+ arr[top]);
    }

    // Displaying the element of the stack 
    void display(){
        if(isEmpty()){
            System.out.println("The stack is empty ");
            return ; 
        }
        System.out.println("The stack elements are ");
        for(int i= 0 ; i <= top;i++ ){
            System.out.println(arr[i]+" ");
        }
        
    }

}