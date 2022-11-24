package Baekjoon;

public class ex045_정수N개의합 {

	public long sum(int[] a) {
		
		long ans = 0;

		for (int i = 0; i < a.length; i++) { // i부터 배열의 길이만큼~
			
			ans += a[i]; // 누적해서 더해준다.
			
		}
		return ans; // 정수의 합

	}

}
