import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[6][2];
        for(int i = 0; i < 6; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int max_width = 0; 
        int max_height = 0;
        int height_index = 0;
        int width_index = 0;
        for(int i = 0; i < 6; i++){
            if(arr[i][0] == 1 || arr[i][0] == 2){
                if(arr[i][1] > max_width){
                    max_width = arr[i][1];
                    width_index = i;
                }
              
            }else{
                if(arr[i][1] > max_height){
                    max_height = arr[i][1];
                    height_index = i;
                }
            }
        }
        
        int minbox = 0;
        minbox = arr[(height_index + 3)%6][1]* arr[(width_index + 3)%6][1];
        int answer = ((max_width * max_height)-minbox)*n;
        System.out.println(answer);
        
     
    }
}