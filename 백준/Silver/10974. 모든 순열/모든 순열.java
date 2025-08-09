import java.io.*;
import java.util.*;

public class Main{
  static int n;
  static int[] output;
  static boolean[] used;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    output = new int [n];
    used = new boolean[n];
    permutation(0);
    
  }

  static void permutation(int depth){
    if(depth == n){
      for(int e : output){
        System.out.print(e+" ");
      }
      System.out.println();
      return;
    }
    for(int i = 0; i < n; i++){
      if(!used[i]){
        output[depth] = i+1;
        used[i] = true;
        permutation(depth+1);
        used[i] = false;
      }
    }


  }
}
