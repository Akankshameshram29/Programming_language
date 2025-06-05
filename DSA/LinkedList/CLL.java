package LinkedList;

public class CLL{
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;   
    }

    private class Node {
        int val;
        Node next;
       
        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(5);
        list.insert(10);
        list.insert(20);
        list.display();
    }



}