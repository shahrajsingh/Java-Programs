import java.lang.*;
import java.io.*;
import java.util.*;
class Pallindrome {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		
		
		
		    int n = sc.nextInt();
		    int m = n;
		    
		    char[][] mat = new char[n][m];
		    for(int i=0; i<n; i++){
                String s = sc.next();
                for(int j=0; j<m; j++)
		            mat[i][j] = s.charAt(j);
            }
		        
		            
            ans.append(solve(0,0,n-1,m-1,mat,new ArrayList<Character>())).append("\n");
		
		System.out.print(ans);
	}
	
	static int solve(int x, int y, int n, int m, char[][] mat, ArrayList<Character> list){
	    
	    if(!isSafe(x, y, n, m))
	        return 0;
	        
        list.add(mat[x][y]);
        if(x == n && y == m){
            if(isPalin(list)){
                list.remove(list.size()-1);
                return 1;
            }else{
                list.remove(list.size()-1);
                return 0;
            }
        }
        
        int res = solve(x,y+1,n,m,mat,list) + solve(x+1,y,n,m,mat,list);
        list.remove(list.size()-1);
        return res;
	}
	
	static boolean isPalin(ArrayList<Character> list){
	    int i=0, j=list.size()-1;
	    while(i<j){
	        if(list.get(i)!=list.get(j))
	            return false;
	            
            i++;
            j--;
	    }
	    return true;
	}
	static boolean isSafe(int x, int y, int n, int m){
	    if(x < 0 || y < 0 || x >n || y>m)
	        return false;
	        
        return true;
	}
}