import java.io.*;
import java.util.*;
public class Main{
  static int N;
  static int [][] map;
  static int [][] dist;
  static int [][ ] dr = {{-1,0},{1,0},{0,-1},{0,1}};
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = 1;

    while(true){
      N = Integer.parseInt(br.readLine());
      if(N == 0) break;

      map = new int [N][N];
      dist = new int [N][N];
      for(int i = 0; i < N ; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N ;j++){
        map[i][j] = Integer.parseInt(st.nextToken());
        dist[i][j] = Integer.MAX_VALUE;
        }
      }

      dijkstra();

      System.out.printf("Problem %d: %d\n",t,dist[N-1][N-1]);
      t++;
    }
  }

  static void dijkstra(){
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
    pq.offer(new int[]{0,0,map[0][0]});
    dist[0][0] = map[0][0];

    while(!pq.isEmpty()){
      int[] cur = pq.poll();
      int i = cur[0];
      int j = cur[1];
      int cost = cur[2];
      if(cost > dist[i][j]) continue;

      for(int d = 0; d < 4; d++){
        int ni = i + dr[d][0];
        int nj = j + dr[d][1];

        if(ni < 0 || nj < 0 || ni >= N || nj >= N) continue;

        int newCost = cost + map[ni][nj];
        if(newCost < dist[ni][nj]){
            dist[ni][nj] = newCost;
            pq.offer(new int[] {ni,nj,newCost});
        }
      }
    }
  }
}
