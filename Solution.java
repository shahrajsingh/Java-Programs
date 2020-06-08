import java.io.*;
import java.util.*;

public class Solution {
    static class Node{
        Node next;
        int d;
        Node(int d){
            this.d = d;
            next = head;
        }
    }
    static Node head = null;
    static void push(int d){
        if(head == null){
            head = new Node(d);
        }else{
            Node temp = new Node(d);
            head = temp;
        }
    }
    static void pop(){
        if(head == null){
            System.out.println("empty");
        }else{
            if(head.next !=null){
                head = head.next;
            }else{
                head = null;
            }
        }
    }
    static int peek(){
        if(head == null){
            return -1;
        }else
        return head.d;
    }
    static int maximum(){
        if(head == null){
            return -1;
        }else{
            int max = Integer.MIN_VALUE;
            Node temp = head;
            while(temp != null){
                if(temp.d > max){
                    max = temp.d;
                }
                temp = temp.next;
            }
            return max;
        }
        
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int max= Integer.MIN_VALUE;
        while(n>0){
            int c = sc.nextInt();
            switch (Integer.parseInt(s[0])) {
                case 1:
                push(Integer.parseInt(s[1]));
                if(Integer.parseInt(s[1]) > max){
                    max = Integer.parseInt(s[1]);
                }
                break;
                case 2:
                if(max == peek()){
                    pop();
                    max = maximum();
                }else{
                    pop();
                }
                
                break;
                case 3:
                System.out.println(max);
                break;
              }
              n--;
        }
        
        
    }
}