package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex48_오타맨고창영 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 고창영.. 저주한다.....
		// 1. 문제 개수 입력! -> scanner 보다는 BufferedReader쓰는 연습 기르기ㅠ
		// 2. 오타를 낸 위치와 오타를 낸 문장 입력
		// 3. 한글자씩 나눈 다음, -> split?
		// 4. 오타를 낸 위치의 문자를 지우기..!
		// 라고 순서를 정해봤다.

		// 1-1. 먼저 입력하기 위해 BufferedReader 불러내기
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// 1-2. 문제 수 입력
		// int question = br.readLine();
		int question = sc.nextInt(); // readLine -> 줄바꿈을 기준으로 입력

//			for(int i = 0; i < question; i ++) {
//			
//				// 2-1. 오타낸 위치 입력
//				int num = Integer.parseInt(br.readLine());
//		
//				// 2. 입력된 단어를 한글자씩 나눠서 word배열에 담기
//				String word[] = br.readLine().split("|");
//			
//				// 3. 마지막에 입력된 녀석을 지우고 나머지를 출력하므는 되지 않을깝쇼
//				[num]........
//				// 근데 이건 어려운거같아 다른 방법을 생각해보기보다 검색해보자..
//				System.out.println(Arrays.toString(word));
//			}

		// 다른 방법으로 시도!
		for (int i = 0; i < question; i++) { // 문제 수가 3개라면 0부터 2까지~

			// 2-1. 오타를 낸 위치 입력하기
			int num = sc.nextInt();

			// 2-2. 단어 입력
			String word = sc.next();

			// 2-3. StringBuilder 객체를 선언해주고 입력된 단어를 넣어준다.
			StringBuilder sb = new StringBuilder(word);

			// 2-4. deleteCharAt : 입력된 위치를 전달해서 지워주는 메소드 
			// (인덱스 개념과 동일, 0부터 세기 때문에 -1을 해줘야 한다)
			sb = sb.deleteCharAt(num - 1);

			// 출력
			System.out.println(sb);

		}
		// BufferedReader를 쓰면 왜 런타임 오류가 나는지
		// 막판에 검색때렸는데 이해 못하겠어서 결국 또 Scanner로 질렀다 짱나네ㅠㅠ
	}
}
