import java.util.Scanner;

public class Main{
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

        while (true) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 0 && b == 0 && c == 0) break;
            
        int max = Math.max(a, Math.max(b, c));
        int x, y;

        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }
     
        String answer;
        if (x*x +y*y == max*max){
            answer = "right";
        }else{
            answer = "wrong";
        }
        System.out.println(answer);
        } 
    }
}