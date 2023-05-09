package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ex257_스택 { 
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
            
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String arr[] = str.split(" ");
				stack.push(Integer.parseInt(arr[1]));
			} else if(str.contains("pop")) { 
				if(stack.empty()) {
					bw.write(-1 + "\n"); 
				} else {
					bw.write(stack.pop() + "\n");		
				}
			} else if(str.contains("size")) {
				bw.write(stack.size() + "\n");
			} else if(str.contains("empty")) {
				if(stack.empty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			}else if(str.contains("top")) {
				if(stack.empty()){
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
			}
		}
		bw.flush();
		bw.close();		
		br.close();
	}
}
