import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Height {
    public static void main(String args[]) {
        final DecimalFormat df3 = new DecimalFormat("#.###");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for Meter to feet,inches");
            System.out.println("press 2 for feet,inches to meter");
            System.out.println("press 3 to exit");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.print("Enter the Height in Meters (m):- ");
                    double height = sc.nextDouble();
                    double inch = ((int) height % ((Math.log(height) + 1) * 10)) * 39.37;
                    inch += ((height - (int) height) * 39.37);
                    int foot = (int) ((inch - (inch % 12)) / 12);
                    inch = inch % 12;
                    if (inch >= 12) {
                        foot++;
                        inch = inch % 12;
                    }
                    System.out.println("Height is :- " + foot + " Foot and " + df3.format(inch) + " inches");
                    break;
                }
                case 2: {
                    System.out.println("Enter height in feet and inches (feet,inches):- ");
                    System.out.print("feet:-");
                    double feet = sc.nextInt();
                    System.out.print("inches:-");
                    double inch = sc.nextInt();
                    double height = (int)((feet * 12) / 39.37)+( (((feet * 12) % 39.37) + inch)/39.27);
                    System.out.println("Height is :- " + df3.format(height) + " meter");
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Please select one option from above");
                }
            }
        }
    }
}
