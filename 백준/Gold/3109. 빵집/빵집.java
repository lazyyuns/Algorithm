import java.util.*;

public class Main{
    static int R, C, count;
    static char[][] map;
    static int[] dr = {-1, 0, 1}; // 위 중간 아래 순서대로
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        count = 0;
        for (int i = 0; i < R; i++) {
            if (dfs(i, 0)){
              count++;
            }
        }

        System.out.println(count);
    }

    static boolean dfs(int r, int c) {
        visited[r][c] = true;
        if (c == C - 1) return true; // 마지막 열 도착 시 성공

        for (int d = 0; d < 3; d++) {
            int nr = r + dr[d];
            int nc = c + 1;
            if (nr >= 0 && nr < R && map[nr][nc] == '.' && !visited[nr][nc]) {
                if (dfs(nr, nc)) return true; // 경로 성공 시 바로 리턴
            }
        }
        return false; // 세 방향 모두 실패 시 false
    }
}
