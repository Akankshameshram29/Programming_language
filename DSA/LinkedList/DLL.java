package LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

     public DLL() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next,Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if (head != null){
            head.prev = node;
        }
    
        head = node;
        if (tail == null) {
            tail = node;
        }


        size+=1;
    }

    public void insertLast(int val){

        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void insert(int val, int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next,temp);
        temp.next.prev = node;
        temp.next = node;

        size ++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.print("Reverse: ");
        temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(12);
        list.insert(24, 1);
        list.insert(36, 2);
        list.insertFirst(6);
        list.insertLast(60);
        list.display();
    }
   


}
