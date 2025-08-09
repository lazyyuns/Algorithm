import java.io.*;
import java.util.*;

public class Main{
    
    static int N, S;
    static int [] nums ;
    static int answer = 0;
    
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        
        nums = new int[N];
        
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        subSet(0,0,0);
        System.out.println(answer);

	    
	}
	
	static void subSet(int depth, int count , int sum){
	    if(depth == N){
	        if(count > 0){
	            if(sum == S){
	                answer ++ ;
	            }
	        }
	        return;
	    }
	    
	    subSet(depth + 1, count +1, sum + nums[depth]);
	    subSet(depth + 1, count, sum);
	}

}


