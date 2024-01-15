package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex498_중간계전쟁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int test = Integer.parseInt(br.readLine());
        // {간달프 군대의 점수}, {샤우론 군대의 점수}
		int[][] point = {{1, 2, 3, 3, 4, 10}, {1, 2, 2, 2, 3, 5, 10}};

		for (int i = 1; i <= test; i++) {
			int[] group = new int[2];
			for (int j = 0; j < 2; j++) {
				st  = new StringTokenizer(br.readLine());
				int n = 0;
				while(st.hasMoreTokens()) {
					group[j] += Integer.parseInt(st.nextToken()) * point[j][n];
					n++;
				}
			}
			bw.write("Battle " + i + ": ");
			if(group[0] > group[1]) { // 간달프가 이겼을 때
				bw.write("Good triumphs over Evil\n");
			} else if(group[0] < group[1]) { // 사우론이 이겼을 때
				bw.write("Evil eradicates all trace of Good\n");
			} else { // 비겼을 때
				bw.write("No victor on this battle field\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
