import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[][] = new int[n][m];
		boolean[][] visited = new boolean[n][m];// 방문한 배열
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < m; j++) {
				arr[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		
		int[] di = {-1,1,0,0};
		int[] dj = {0,0,-1,1}; // 상하좌우
		
		int count = 0; // 그림의 수
		int maxPic = 0; // 가장 큰 그림의 넓이
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				
				if(arr[i][j] == 1 && !visited[i][j]) {
					count ++;
					int area = 0;
					
					Queue<int[]> q = new LinkedList<>();
					q.offer(new int[]{i, j});
					visited[i][j] = true;
					
					while(!q.isEmpty()) {
						int[] temp = q.poll();
						int ci = temp[0], cj = temp[1];
						area++;
						
						for(int d = 0; d < 4; d++) {
							int ni = ci + di[d];
							int nj = cj + dj[d];
							
							if(ni < 0 || ni >= n|| nj < 0 || nj >= m) continue;
							if(visited[ni][nj]) continue;
							if(arr[ni][nj] == 0) continue;
							
							visited[ni][nj] = true;
							q.offer(new int[] {ni, nj});  
						}
					}
					maxPic = Math.max(maxPic, area);
				}
			}
		}
		
		System.out.println(count);
		System.out.println(maxPic);
 	
		
	}

}
