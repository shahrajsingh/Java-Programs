import java.util.*;

public class Pattern_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n + (n - 1);
        for (int num = 1; num <= n; num++) {
            String s = "";
            for (int a = 1; a <= num; a++) {
                s += a;
            }
            for (int a = num - 1; a >= 1; a--) {
                s += a;
            }
            for (int z = 0; z < n - num; z++) {
                System.out.print(" ");
            }
            System.out.println(s);
        }

        for (int num = n - 1; num >= 1; num--) {
            String s = "";
            for (int a = 1; a <= num; a++) {
                s += a;
            }
            for (int a = num - 1; a >= 1; a--) {
                s += a;
            }
            for (int z = 0; z < n - num; z++) {
                System.out.print(" ");
            }
            System.out.println(s);
        }

    }
}