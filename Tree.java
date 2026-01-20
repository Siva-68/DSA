import java.util.*;

class Tree{
    class Node{
    int data ;
    Node left , right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
    Node root ;
    
    Tree(){
        root = null;
    }

    // Creating the elements are stored in a tree manner 
    Node insert(Node root,int value){
        
        if(root == null ){
           return new Node(value);
        }
        if(value< root.data){
            root.left = insert(root.left, value);
        }
        else if(value > root.data){
            root.right= insert(root.right, value) ;
        }
        else return root;
    }

    // inorder Printing
    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" -> ");
            inOrder(root.right);
        }
    }    

    // Preorder Printing
    void preOrder(Node root){
        System.out.println();
        if(root != null){
            System.out.print(root.data+ " -> ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Post Order printing
    void postOrder(Node root){
        System.out.println();
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " -> ");
        }
    }
}