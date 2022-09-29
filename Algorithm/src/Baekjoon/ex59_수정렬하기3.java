package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex59_수정렬하기3 {

	public static void main(String[] args) throws Exception {
		
		// 제한시간이 5초, 그렇다면 당연히 scanner는 안쓰고 무조건 BufferedReader 호출해야지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); // 개수 입력!
		int[] data = new int[num]; // 입력된 개수만큼의 칸을 만들어주고
		for (int i = 0; i < num; i++)
			data[i] = Integer.parseInt(br.readLine()); // 그만큼의 수를 입력한다.

		Arrays.sort(data); // 그리고 그 입력된 수들을 오름차순으로 정렬

		for (int i = 0; i < num; i++)
			bw.write(data[i] + "\n"); // 순서대로 출력쓰

		bw.flush();
		bw.close();
		br.close();
	}
}
