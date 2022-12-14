package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex121_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {

		// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지
		
		// 시간 제한이 0.15초이기 때문에 무조건 BufferedReader를 써야겠다고 생각함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 1. 달팽이는 낮에 A미터 올라갈 수 있다. 
		// 2. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
		// 3. 또, 정상에 올라간 후에는 미끄러지지 않는다.
		int up = Integer.parseInt(st.nextToken()); // 올라가는 거
		int down = Integer.parseInt(st.nextToken()); // 미끄러지는 거
		int length = Integer.parseInt(st.nextToken()); // 나무의 높이

		int day = (length - down) / (up - down); // 걸리는 일 수
		if ((length - down) % (up - down) != 0)
			day++;

		System.out.println(day);

	}

}
