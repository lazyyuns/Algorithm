import java.util.*;

public class Main{
  static int n, r;
  static int[] output;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    r = sc.nextInt();
    output = new int[r];
    comb(0, 0);
    sc.close();

  }

  static void comb(int start,int depth){
    if(depth == r){
      for(int e : output){
        System.out.print(e+" ");
      }
      System.out.println();
      return;
    }
    for(int i = start; i < n; i++){
      output[depth] = i+1;
      comb(i+1, depth+1);
    }


  }
}