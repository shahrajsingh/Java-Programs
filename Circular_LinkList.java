import java.util.*;

public class Circular_LinkList {
    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
        }
    }

    static Node head = null;
    static Node tail;
    static void add(int d) {
        if (head == null) {
            head  = new Node(d);
            head.next = head;
        } else {
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = new Node(d);
            temp.next.next = head;
        }
    }

    static int length() {
        if (head == null) {
            return 0;
        } else {
            int d = 1;
            Node temp = head;
            while (temp.next != head) {
                d++;
                temp = temp.next;
            }
            return d;
        }
    }
    static void rotate(int key){
        Node t=head;
        while(key > 0){
            t= t.next;
            key--;
        }head = t;
    }
    static void print() {
        int len = length();
        Node temp = head;
        for (int a = 0; a < len; a++) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            add(i);
        }
        print();
        rotate(1);
        System.out.println();
        print();
    }

}