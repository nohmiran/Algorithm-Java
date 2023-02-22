package 과제;

import java.util.Scanner;
import java.util.Stack;

public class ex06_제어문 {

	public static void main(String[] args) {

//		[ "3",  "7", "*" , "2",  "+" ]  -> ((3 * 7) + 2) = 23
//		==> 0일 때 외 처리도 고려해야 함.

		String[] str = new String[5];
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int num1, num2;
		int result;

		for (int i = 0; i < str.length; i++) { // 입력 받은 문자들을 배열에 차례로 담아주기.
			str[i] = sc.next();
		}

		// 1. 숫자와 연산자를 구분하기(if문을 이용)
		for (int i = 0; i < str.length; i++) {

			// 2. 연산자를 만났을 때,
			// 숫자 2개를 꺼내어 연산 후 스택에 다시 넣기
			if (str[i].equals("+")) { // "+" 연산자를 만나면
				num1 = stack.pop(); // 숫자 두개를 빼서(pop)
				num2 = stack.pop();

				result = num2 + num1; // 더한 다음 result라는 변수명에 담고
				stack.push(result); // result를 스택에 넣어준다.(push)

			} else if (str[i].equals("-")) { // "-" 연산자를 만나면
				num1 = stack.pop();
				num2 = stack.pop();

				result = num2 - num1;
				stack.push(result);

			} else if (str[i].equals("*")) { // "*" 연산자를 만나면
				num1 = stack.pop();
				num2 = stack.pop();

				result = (num2 * num1);
				stack.push(result);

			} else if (str[i].equals("/")) { // "/" 연산자를 만나면
				num1 = stack.pop();
				num2 = stack.pop();

				result = (num2 / num1);
				stack.push(result);

			} else {
				
				stack.push(Integer.parseInt(str[i]));
				
			}

		}
		// 3. 모든 수식이 끝나면 스택에 계산 결과만이 남음. -> 출력

		result = stack.pop();
		System.out.println("계산결과 = " + result);

	}

}
