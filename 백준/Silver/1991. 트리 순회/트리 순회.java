
import java.util.*;
import java.io.*;
public class Main{
	
	static int [][] tree;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine()); // 노드의 갯수 		 
		 tree = new int[26][2];
		 for(int i = 0; i < 26; i++) {
			 Arrays.fill(tree[i], -1);
		 }
		 
		 for(int i = 0; i < n; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 char parent = st.nextToken().charAt(0);
			 char left = st.nextToken().charAt(0);
			 char right = st.nextToken().charAt(0);
			 
			 if(left == '.' ) tree[parent-'A'][0] = -1; 
			 else tree[parent-'A'][0] = left-'A';
			 if(right == '.' ) tree[parent-'A'][1] = -1; 
			 else tree[parent-'A'][1] = right-'A';
             // tree 배열에 번호로 알파벳 저장 
		 }
		 
		 preorder(0); 
		 sb.append("\n");
		 inorder(0); 
		 sb.append("\n");
		 postorder(0); 
		 sb.append("\n");
		 System.out.println(sb);
		 
		 
	}
	
	static void preorder(int node) { // root -> left -> right
		if(node == -1)return; // 자식이 없으면 return해 sb에 따로 저장되는 문구가 없음
		sb.append((char)(node+'A')); // 루트먼저 
		preorder(tree[node][0]);
		preorder(tree[node][1]);
	}
	static void inorder(int node) { // left -> root -> right
		if(node == -1)return;
		inorder(tree[node][0]); 
		sb.append((char)(node+'A')); // 루트 
		inorder(tree[node][1]);
		
	}
	static void postorder(int node) { // left -> right -> root
		if(node == -1)return;
		postorder(tree[node][0]);
		postorder(tree[node][1]);
		sb.append((char)(node+'A'));//루트
		
	}

}
