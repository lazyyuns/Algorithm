import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String line = br.readLine(); 
            max = Math.max(max, line.length());// 최대길이 입력 찾기
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) { 
            for (int j = 0; j < 5; j++) { //세로로 순회
                if (arr[j][i] != '\0') { // null값이 아니면
                    sb.append(arr[j][i]);//sb에 넣기
                }
            }
        }
        System.out.print(sb.toString());// String으로 변환 후 출력
    }
}
