import java.util.*;
import java.util.function.IntFunction;

public class Recursion {
    static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            // int res = 0;
            n = n * (power(n, p - 1));
            return n;
        }
    }

    static void even(int ll, int ul) {
        // d not required
        int d = ll;
        if (ll < 0 || d > ul) {
            return;
        } else if (d == 0) {
            System.out.println(d + " ");
            even(d + 1, ul);
        } else {
            if (d % 2 == 0) {
                System.out.print(d + ",");
            }
            even(d + 1, ul);
        }
    }

    static void natural(int ll, int ul) {
        if (ll < 1 || ll > ul) {
            return;
        } else {
            System.out.print(ll + ",");
            natural(ll + 1, ul);
        }
    }

    static int sumofnatural(int ll, int ul) {
        int sum = ll;
        if (ll < 1 || ll > ul) {
            return 0;
        } else {
            sum += sumofnatural(ll + 1, ul);
            return sum;
        }
    }

    static int sumofeven(int ul, int ll) {
        int sum = 0;
        if (ll < 0 || ll > ul) {
            return 0;
        } else if (ll == 0) {
            sum = ll;
            sum += sumofeven(ul, ll + 1);
            return sum;
        } else {
            if (ll % 2 == 0) {
                sum = ll;
                sum += sumofeven(ul, ll + 1);
                return sum;
            } else {
                sum += sumofeven(ul, ll + 1);
                return sum;
            }
        }
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n % 10 + " ");
            reverse(n / 10);
        }
    }

    static String reverse2(int n) {
        String s = "";
        if (n == 0) {
            return "";
        } else {
            s += n % 10;
            s += reverse2(n / 10);
            return s;

        }
    }

    static void palindrome(int n) {
        // divide and conquer
        if (n == Integer.parseInt(reverse2(n))) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

    static int digits(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        } else {
            sum += n % 10;
            sum += digits(n / 10);
            return sum;

        }
    }

    static int factorial(int n) {
        int fact = n;
        if (n == 0) {
            return 1;
        } else {
            fact *= factorial(n - 1);
            return fact;
        }
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
            // System.out.println(last);
        }
    }

    public static void main(String args[]) {
        // Find power using recursion
        // System.out.println(power(2, 5));
        // print all even number using recursion
        // even(1, 10);
        // print natural number
        // natural(1,10);
        // sum of natural number using recursion
        // System.out.println(sumofnatural(1,100));
        // sum even or odd using recursion
        // System.out.println(sumofeven(100, 1));
        // find reverse using recursion
        // reverse(12345);
        // check palindrome
        // palindrome(1221);
        // summ of digits
        // System.out.println(digits(1234));
        // factorial of number
        // System.out.println(factorial(10));
        // generate fibionacci
        System.out.println(fibonacci(3));
    }
}