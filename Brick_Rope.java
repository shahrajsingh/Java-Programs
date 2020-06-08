import java.util.*;

public class Brick_Rope {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int arr[] = new int[h];
        for (int a = 0; a < h; a++) {
            arr[a] = sc.nextInt();
        }
        int b = sc.nextInt();
        int r = sc.nextInt();

        for (int a = 0; a < h - 1; a++) {
            if(r<=0 && b<=0){
                if(arr[a+1]<arr[a] && a==h-2){
                    System.out.println(a+2);
                }else if(arr[a+1]<arr[a])
                continue;
                else
                System.out.println(a+1);
            }
            int s = a + 1;
            if (arr[s] > arr[a]) {
                if (arr[s] - arr[a] > b) {
                    System.out.println("rope used at"+(a+1));
                    if (r-- <= 0 ) {
                        System.out.println(a+2);
                        break;
                    } else
                        r--;
                    continue;
                }else if(r>0 && arr[s]-arr[a]==b){
                    if(arr[s+1]-arr[s]<b)
                        r--;
                        else
                        b-=arr[s]-arr[a];
                }
                 else {
                    System.out.println("brick used at"+(a+1));
                    b -= arr[s] - arr[a];
                    if (r <= 0 && b <= 0) {
                        System.out.println(a+2);
                        break;
                    }

                }
            } else {
                continue;
            }

        }

    }
}