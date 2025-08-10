import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 동기의 수
		int m = Integer.parseInt(br.readLine()); // 친구 관계 수
		
		List<Integer>[] graph = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
			
		}
		
		boolean[] visited = new boolean[n+1];
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {1,0});
		visited[1] = true;// 상근이에서 BFS 시작
		
		int count = 0;// 친구 수 세기
		while(!q.isEmpty()) { 
			int[] cur = q.poll();
			int node = cur[0];
			int depth = cur[1];
			
			if(depth >= 2) continue; // 친구의 친구까지만
			
			for(int next: graph[node]) { // 해당 노드의 친구를 찾고 큐에 저장
				if(!visited[next]) {
					visited[next] = true;
					count++;
					q.add(new int[]{next, depth+1});
				}
			}
		}
		System.out.println(count);
	}

}
