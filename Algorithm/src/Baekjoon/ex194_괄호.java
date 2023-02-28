package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class ex194_괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack();

		int num = sc.nextInt();
		String str = sc.nextLine();

		for (int i = 0; i < num; i++) {

			str = sc.nextLine();

			for (int j = 0; j < str.length(); j++) {

				char c = str.charAt(j);

				if (stack.isEmpty()) {
					stack.push(c);
				} else {
					if (c == ')') {
						if (stack.peek() == '(') { // 다음 문자가 (라면
							stack.pop(); // 제거
						} else {
							stack.push(c); // (가 아니라면 추가
						}
					} else {
						stack.push(c); // )가 아니고 (라면 추가
					}
				}
			}
			if (stack.isEmpty()) { // 스택에 남는 문자가 없다면
				System.out.println("YES");
			} else { // 뭔가 찌꺼기 하나라도 남아 있다면 ㅠ
				System.out.println("NO");
			}
			stack.clear();
		}

	}

}
