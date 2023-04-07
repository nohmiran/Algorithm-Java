package Baekjoon;

import java.util.*;

public class ex230_제로 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int test = sc.nextInt();
		int result = 0;
		
        for (int i = 0; i < test; i++) {
			int num = sc.nextInt();
			if(num == 0) { // 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고
				stack.pop();
			}else { // 아닐 경우 해당 수를 쓴다.
				stack.push(num);
			}
		}
		
		while(!stack.isEmpty()) {
			result += stack.peek(); // 스택에 남아있는 수 합산.
			stack.pop();
		}

		System.out.println(result);
	}
}
