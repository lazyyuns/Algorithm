import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int answer = fibonacci(n);
        System.out.println(answer);
        
    }
    
    public static int fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
    
}