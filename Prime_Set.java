import java.util.*;

public class Prime_Set {
    static boolean check_prime(int x) {
        boolean flag = false;
        for (int a = 2; a <= x / 2; a++) {
            if (x % a == 0) {
                flag = true;
                break;
            } else {
                continue;
            }
        }
        if (!flag) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(System.console().readLine());
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int a = 1; a <= x; a++) {
            if (x % a == 0) {
                s.add(a);
                if (a != 1 && check_prime(a)) {
                    p.add(a);
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        int arr[] = new int[p.size()];
        for(int a=0;a<p.size();a++){
            int count =0;
            for(int b=0;b<s.size();b++){
                if(s.get(b) % p.get(a) == 0){
                    count++;
                }
            }
            arr[a] = count;
        }
        int prod = 1;
        for(int a=0;a<arr.length;a++){
            prod *= arr[a];
        }
        prod %= 1000003;
        System.out.println(prod);
    }

}