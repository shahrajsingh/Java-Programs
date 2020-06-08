import java.util.Scanner;

public class minmaxWeight {
    static int checkdgnl(int max,int arr[][],int one[],int two[]){
        
        
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        while(q>0){
            int one[] = new int[2];
        for(int a=0;a<2;a++){
            one[a] = sc.nextInt();
        }
        int two []= new int[2];
        for(int a=0;a<2;a++){
            two[a] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        if(one[1] == two[1]){
            check();
        }else{
            max = checkdgnl(max,arr,one,two);
            max = check();
        }
        

        q--;
        }
        
    }
}