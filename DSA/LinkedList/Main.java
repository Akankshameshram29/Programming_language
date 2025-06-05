package LinkedList;


class SLL{
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void Duplicates(){
        Node node = head;
        while (node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i =1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size ++;
    }

    //Insertion using Recursion
    public void insertRec(int val,int index){
        head = insertRecNode(val, index, head);
    
    }

    private Node insertRecNode(int val,int index,Node node){
        if(index == 0){
            size++;
            return new Node(val,node);
        }
        node.next = insertRecNode(val,index-1,node.next);
        return node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}

public class Main {
    public static void main(String[] args) {
        SLL newlist = new SLL();
        newlist.insertFirst(1);
        newlist.insert(1,1);
        newlist.insert(1,2);
        newlist.insert(1, 3);
        newlist.insert(2, 4);
        newlist.insert(2, 5);
        newlist.insert(3, 6);
        newlist.insert(3, 7);
        newlist.insert(3, 8);
        newlist.insert(4, 9);
        newlist.insert(5, 10);
        newlist.insert(5, 11);
        newlist.display();
        newlist.Duplicates();
        newlist.display();
        
    }
}