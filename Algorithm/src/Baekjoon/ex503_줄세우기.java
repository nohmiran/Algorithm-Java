package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex503_줄세우기 {

	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int num = Integer.parseInt(st.nextToken());
		String line = st.nextToken();
		int result = 0;
        
		while (num-- > 0) {
			result++;
			if (String.valueOf(result).contains(line)) {
                num++;
		    }
    }
		System.out.println(result);
		br.close();
	}
}
