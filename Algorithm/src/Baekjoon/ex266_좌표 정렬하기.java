package Baekjoon;

import java.util.Scanner;
import java.util.Arrays;
 
public class ex266_좌표 정렬하기 {
    
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] arr = new int[num][2];
		
		for(int i = 0; i < num; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, (seq1, seq2) -> { // seq1, seq2 비교...............
			if(seq1[0] == seq2[0]) { // 같다면...
				return seq1[1] - seq2[1]; // 뒤에 놈 비교...
			} else { // 다르다면...
				return seq1[0] - seq2[0]; // 계산 후 큰 놈을 앞세움.....
			}
		});
		
		for(int i = 0; i < num; i++) {
            // 좌표 정렬하기 2 문제와 출력 방식만 다르네 쩜쩜..
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
