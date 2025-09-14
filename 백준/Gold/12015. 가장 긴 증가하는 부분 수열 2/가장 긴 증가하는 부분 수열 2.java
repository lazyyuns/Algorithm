import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(A[0]);
		
		for(int i = 1; i < N; i++) {
			int key = A[i]; // 기준값 지정
			if(list.get(list.size()-1) < key) { // list의 마지막 요소와 비교해서 key가 더 크면 추가 
				list.add(key);
			}else {
				int low = 0; 
				int high = list.size()-1;
				
				while(low < high) {
					int mid = (low + high) / 2;
					if(list.get(mid) >= key) high = mid;
					else low = mid + 1;
				}
				list.set(high, key);
			}
			
		}
		System.out.println(list.size());
		

	}

}
