import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int a = 1; a <= n; a++) {
            if (n % a == 0) {
                s.add(a);
            }
        }
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int a = 1; a < s.size(); a++) {
            int num = s.get(a);
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                p.add(num);
        }
        ArrayList<Integer> pscore = new ArrayList<Integer>();
        for (int a = 0; a < p.size(); a++) {
            int count =0;
            for (int b = 0; b < s.size(); b++) {
                if(s.get(b) % p.get(a) == 0){
                    count++;
                }
            }
            pscore.add(count);
        }
        int result = 1;
        for(int a=0;a<pscore.size();a++){
            result *= pscore.get(a);
        }
        System.out.println((int)(result % 10000003));
    }
}