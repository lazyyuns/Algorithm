import java.io.*;
import java.util.*;

public class Main{ // N개에서 k개를 순서 상관 없이 뽑는 경우의 수 
  static int count = 0;
  static int k,n;
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    comb(1,0);
    System.out.println(count);
    sc.close();
    
  }
  
  static void comb(int start, int depth){
    if(depth == k){
      count ++ ;
      return;
    }
    for(int i = start; i <=  n; i++){
      comb(i+1, depth+1);
      
    }
    
  }
}