import java.io.*;
import java.util.*;
public class Main{
	static int n;
	static int[] sour ;
	static int[] bitter ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sour = new int [n];
		bitter = new int [n];
		
		for(int i = 0; i < n; i++) {
			sour[i] = sc.nextInt();
			bitter[i] = sc.nextInt();
		}
		
		subSet(0,1,0,0);
		System.out.println(min);
		
	}
	static int min = Integer.MAX_VALUE;
	static void subSet(int depth, int sourSum, int bitterSum, int count) { //공집합은 안되니까 뺌 ( 최소한 하나 이상의 재료를 선택 해야함 )
		if(depth == n) {
			if(count > 0) {
				min = Math.min(Math.abs(sourSum-bitterSum), min);
			}
			return;
		}
		subSet(depth+1, sourSum * sour[depth], bitterSum + bitter[depth], count + 1); // 재료를 넣었을 
		subSet(depth+1, sourSum, bitterSum, count); // 안 넣었을 
	
	}
}