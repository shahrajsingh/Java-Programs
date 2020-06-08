import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Iterative_Word_Suggestion {
    class Node {
        String word;
        int freq;
        Node next;

        Node(String s, int f) {
            this.word = s;
            this.freq = f;
            next = null;
        }
    }

    Node head = null;

    void add(String wd, int f) {
        if (head == null) {
            head = new Node(wd, f);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(wd, f);
        }
    }

    void print() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.word + " " + temp.freq);
                temp = temp.next;
            }
        }
    }

    static void print(Iterative_Word_Suggestion obj, String mch) {
        String arr[] = new String[5];
        int arrf[] = new int[5];
        int ind = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        Node temp = obj.head;
        while (temp != null) {
            if (count < 5 && temp.word.matches("(.*)"+mch+"(.*)")) {
                arr[ind] = temp.word;
                arrf[ind] = temp.freq;
                if(min < temp.freq)
                    min = temp.freq;
                count++;
                ind++;
            } else {

                int index;
                if(temp.freq > min && temp.word.matches("(.*)"+mch+"(.*)")){
                    for (int a = 0; a < 5; a++) {
                        if(arrf[a] < temp.freq){
                            arr[a] = temp.word;
                            arrf[a] = temp.freq;
                        }
                    }
                    min = Integer.MAX_VALUE;
                    for(int a=0;a<5;a++){
                        if(min < arrf[a]){
                            min = arrf[a];
                        }
                    }
                }
                
            }
            temp = temp.next;
        }
        
        for(int a=0;a<5;a++){
            System.out.print(arr[a]+",");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\EnglishDictionary.csv");
        BufferedReader br = new BufferedReader(fr);
        Iterative_Word_Suggestion obj[] = new Iterative_Word_Suggestion[26];
        for (int a = 0; a < 26; a++) {
            obj[a] = new Iterative_Word_Suggestion();
        }
        while (br.readLine() != null) {
            int t = br.readLine().charAt(0);
            if (t < 97) {
                t += 32;
            }
            String st[] = br.readLine().split(",");
            int f = Integer.parseInt(st[1]);
            obj[t - 97].add(st[0], f);
        }
        String word = System.console().readLine();
        int wlen = word.length();
        int x = word.charAt(0);
        if (x < 97) {
            x += 32;
        }
        for(int a=0;a<wlen;a++){
            
        String match = "";
        match += word.charAt(a);
        print(obj[x - 97], match);
        }
        
    }
}