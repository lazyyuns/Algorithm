import java.io.*;
import java.util.*;
public class Main{
	static final int INF = 100000000;
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int [][] dist = new int[n+1][n+1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				if(i != j) {
					dist[i][j] = INF;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			dist[a][b] = Math.min(dist[a][b], d);
		}
		

		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
 				}
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(dist[i][j] == INF) System.out.print(0+" ");
				else System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
