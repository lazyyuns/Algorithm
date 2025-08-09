import java.util.*;
public class Main{
    static int [] nums;
    static int [] output;
    static int k;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            k = sc.nextInt();
            if(k == 0) break;

            nums = new int[k];
            for(int i =0; i < k; i++){
                nums[i] = sc.nextInt();
            }
            output = new int[6];

            comb(0, 0);
            System.out.println();
            
        
        }
    }


    public static void comb(int start, int depth){
        if(depth == 6){
            for(int e : output){
                System.out.print(e+" ");
            }
            System.out.println();
            return;
        }
        
        for(int i = start; i < k; i++){
            output[depth] = nums[i];
            comb(i+1, depth+1);
        }

    }
}
