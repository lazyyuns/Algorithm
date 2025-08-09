import java.io.*;
import java.util.*;

public class Main{
  static int n, r;
  static int[] output;
  static boolean[] used;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    r = sc.nextInt();
    output = new int[r];
    used = new boolean [n+1];
    permutation(0);
  }

  static void permutation(int depth){
    if(depth == r){
      for(int e : output){
        System.out.print(e+" ");
      }
      System.out.println();
      return;
    }
    for(int i = 1; i <= n; i++){
      if(!used[i]){
        output[depth] = i;
        used[i] = true;
        permutation(depth+1);
        used[i] = false;
      }
    }
  }
}