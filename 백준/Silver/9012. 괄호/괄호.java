import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            Stack<Character> st = new Stack <>();
            String input = br.readLine();
            String answer = "YES";
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i)=='('){
                    st.push(input.charAt(i));
                }else{
                    if(st.isEmpty()){
                        answer = "NO";
                        break;
                    }else{
                        st.pop();
                    }
                } 
                
            }
            if(!st.isEmpty()) answer = "NO";
            System.out.println(answer);
        
        }
    }
}