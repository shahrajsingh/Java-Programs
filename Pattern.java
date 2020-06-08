import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int x = 65;
        n = sc.nextInt();
        String sample = "";
        for (int a = 0; a < n; a++) {
            char temp = (char) x;
            sample += temp;
            x++;
        }
        int check = 1;
        int len = sample.length();
        for (int i = n - 1; i >= 0; i--) {
            for (int a = 0; a < len - 1; a++) {
                int tempo = a-i;
                if (check > 2 && tempo >= 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(sample.charAt(a));
                }
            }
            if (i == n - 1) {
                System.out.print(sample.charAt(n - 1));
            } else {
                System.out.print(" ");
            }

            for (int b = len - 2; b >= 0; b--) {
                int tempor = b-i;
                if (check > 2 && tempor >= 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(sample.charAt(b));
                }
            }
            System.out.println("");
            check++;
        }
    }
}
