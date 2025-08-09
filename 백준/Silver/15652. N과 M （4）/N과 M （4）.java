import java.util.*;
public class Main {
  static int N, M;
  static int[] output;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    output = new int[M];

    comb(0,0);
    sc.close();
  }

  static void comb(int start, int depth){
    if(depth == M){
      for(int e : output){
        System.out.print(e+" ");
      }
      System.out.println();
      return;
    }
    for(int i = start; i < N; i++){
      output[depth] = i+1;
      comb(i, depth+1);
    }
  }
}
