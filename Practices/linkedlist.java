import java.util.*;

class linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;

        }
    }

    linkedlist() {
        head = null;
    }

    protected void insertatbegin(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            // next = null;
        } else {
            newnode.next = head;
            head = newnode;

        }

    }
    public void display()
    {
        // if (next==null){

        // }
    }
}