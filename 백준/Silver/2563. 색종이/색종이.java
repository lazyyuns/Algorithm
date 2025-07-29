import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[][] paper = new boolean[100][100];
        
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 100; j++){
                paper[i][j] = false;
            }
        }
        
        int sum = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = y; j < y+10; j++){
                for(int k = x; k < x+10; k++){
                    if(paper[j][k] == false){
                        paper[j][k] = true;
                        sum ++;
                    }
                }
            }
            
        }
        System.out.println(sum);
    }
}