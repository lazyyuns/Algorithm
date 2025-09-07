import java.io.*;
import java.util.*;

public class Main{
  static int N, M;
  static int [][] map;
  static int safeMax;
  static int [][] dr = {{-1,0},{1,0},{0,-1},{0,1}};
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    map = new int[N][M];
    for(int i = 0; i < N ; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < M; j++){
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    safeMax = 0;
    makeWall(0);
    System.out.println(safeMax);
  }

  static void makeWall(int depth ){
    if(depth == 3) {
      virus();
      return;
    };

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        if(map[i][j] == 0){
          map[i][j] = 1;
          makeWall(depth + 1);
          map[i][j] = 0;
        } 
      }
    }
  }

  static void virus(){
    int [][] copyMap = new int [N][M];
    for(int i = 0; i < N; i++){
      copyMap[i] = map[i].clone();
    }
    Queue <int[]> q = new LinkedList<>();
    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        if(copyMap[i][j] == 2){
          q.offer(new int[] {i,j});
          while(!q.isEmpty()){
            int [] current = q.poll();
            int ci = current[0];
            int cj = current[1];
            
            for(int d = 0; d < 4; d++){
              int ni = ci + dr[d][0];
              int nj = cj + dr[d][1];
              if(ni < 0 || nj < 0 || ni >= N || nj >= M) continue;
              if(copyMap[ni][nj] != 0) continue;
              copyMap[ni][nj] = 2;
              q.offer(new int[] {ni, nj});
            }
          }
        }
      }
    }
    int cnt = 0;
    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        if(copyMap[i][j] == 0){
          cnt ++;
        }
      }
    }
    safeMax = Math.max(safeMax, cnt);
  }

}
