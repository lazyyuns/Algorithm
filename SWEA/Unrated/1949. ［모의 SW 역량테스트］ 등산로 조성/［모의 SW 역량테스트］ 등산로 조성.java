import java.io.*;
import java.util.*;

public class Solution{
    static int N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[][] dr = {{-1,0},{1,0},{0,-1},{0,1}};
    static int answer;

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][N];
            int peak = 0; // 가장 높은 봉우리
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    peak = Math.max(peak, map[i][j]);
                }
            }

            answer = 0;
            // 가장 높은 봉우리에서 DFS 시작
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j] == peak) {
                        visited = new boolean[N][N];
                        dfs(i, j, 1, false); 
                    }
                }
            }

            System.out.printf("#%d %d\n", t, answer);
        }
    }

    static void dfs(int i, int j, int len, boolean digUsed) {
        visited[i][j] = true;
        answer = Math.max(answer, len);

        for(int d = 0; d < 4; d++) {
            int ni = i + dr[d][0];
            int nj = j + dr[d][1];
            if(ni < 0 || nj < 0 || ni >= N || nj >= N) continue;
            if(visited[ni][nj]) continue;

            if(map[ni][nj] < map[i][j]) { 
                // 그냥 이동 가능
                dfs(ni, nj, len+1, digUsed);
            } else if(!digUsed) { 
                // 깎아서 갈 수 있는 경우
                for(int k = 1; k <= K; k++) {
                    if(map[ni][nj] - k < map[i][j]) {
                        map[ni][nj] -= k;
                        dfs(ni, nj, len+1, true);
                        map[ni][nj] += k; // 원상복구
                    }
                }
            }
        }

        visited[i][j] = false; // 백트래킹
    }
}
