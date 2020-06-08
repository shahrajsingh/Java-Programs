 import java.util.*;

public class LinkList {
    static class Node {
        Node next;
        int data;

        Node(int d) {
            next = null;
            data = d;
        }
    }

    static Node head = null;
   // static Node tail = null;

    static void add(int d) {
        if (head == null) {
            head = new Node(d);
            //tail = head;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(d);
        }
    }

    static void push(int d) {
        if (head == null) {
            head = new Node(d);
            //tail = head;
        } else {
            Node temp = new Node(d);
            temp.next = head;
            head = temp;
        }
    }

    static int pop() {
        int d = 0;
        if (head == null) {
            System.out.println("empty list");
            return d;
        } else {
            d = head.data;
            head = head.next;
            
        }
        return d;
    }

    static void delete(){
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while(temp.next.next != null){
               
                temp = temp.next;
            }
            temp.next = null;
            //tail = temp.next;
        }
    }
    static void delete(int key){
        if (head == null) {
            System.out.println("empty list");
        }else{
            Node temp = head;
            if(temp.data == key && temp.next != null){
                head = temp.next;
            }else if(temp.data == key && temp.next == null){
                head = null;
            }else{
                while(temp.next.data != key){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            
        }
    }

    static void print() {
        System.out.println("");
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }
    static void reverse(){
        if (head == null) {
            System.out.println("empty list");
        }else{
            Node prev = null;
            Node curr = head;
            Node next = null;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    
    static void stackreverse(){
        int d = size();
        int arr[] = new int[d];
        if (head == null) {
            System.out.println("empty list");
        }else{
                for(int a=0;a<d;a++){
                    arr[a]= pop();
                }
                for(int b=0;b<d;b++){
                    push(arr[b]);
                }
        }
    }
    static int size(){
        int length = 0;
        if (head == null) {
            System.out.println("empty list");
            return length;
        }else{
            Node temp = head;
            while(temp !=null){
                length++;
                temp =temp.next;
            }
            return length;
        }
    }
    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {
            add(i);
        }
        print();
        push(5);
        push(6);
        
        print();
        System.out.println(pop());
        System.out.println(pop());
        print();
        delete();
        print();
        delete();
        print();
        add(3);
        print();
        delete(1);
        delete(3);
        print();
        add(3);
        add(4);
        push(1);
        System.out.println(size());
        stackreverse();
        print();
        reverse();
        print();
    }
}