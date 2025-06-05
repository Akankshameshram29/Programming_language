package trees;

import java.util.Scanner;

class BinaryTree{
    public BinaryTree() {

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
       if(left){
        System.out.println("Enter the value of the left of "+node.value);
        int value = scanner.nextInt();
        node.left = new Node(value);
        populate(scanner, node.left);
       }
       System.out.println("do you want to enter right of" +node.value);
       boolean right = scanner.nextBoolean();
       if(right){
        System.out.println("Enter the value of the right of"+node.value);
        int value = scanner.nextInt();
        node.right=new Node(value);
        populate(scanner, node.right);
    }
}
public void display() {
    display(root, "", true);
}

private void display(Node node, String indent, boolean isLast) {
    if (node != null) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└── ");
            indent += "    ";
        } else {
            System.out.print("├── ");
            indent += "│   ";
        }
        System.out.println(node.value);
        display(node.left, indent, false);
        display(node.right, indent, true);
    }
}

public void PreOrder(){
    PreOrder(root);
}
private void PreOrder(Node node){
    if(node == null){
        return;
    }
    System.out.print(node.value+" ");
    PreOrder(node.left);
    PreOrder(node.right);
}
public void InOrder(){
    InOrder(root);
}

private void InOrder(Node node){
    if(node == null){
        return;
    }
    InOrder(node.left);
    System.out.print(node.value+" ");
    InOrder(node.right);
}

public void PostOrder(){
    PostOrder(root);
}

private void PostOrder(Node node){
    if(node == null){
        return;
    }
    PostOrder(node.left);
    System.out.print(node.value+" ");
    PostOrder(node.right);
}


}