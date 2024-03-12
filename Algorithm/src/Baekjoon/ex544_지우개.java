package Baekjoon;

import java.io.*;
import java.util.*;

public class ex544_지우개 {

	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();

        // 1부터 n까지의 수를 리스트 arr에 추가
		for(int i = 1; i < n + 1; i++){
			arr.add(i);
		}
		while(true){
            // arr 크기가 1이면 break.
			if(arr.size() == 1){
				break;
			}
            // arr의 칸이 홀수칸일 때 remove
			for(int i = 0; i < (arr.size() / 2) + 1; i++){
				arr.remove(i);
				if(arr.size() == 1){
					break;
				}
			}
		}
        // arr의 첫 번째 요소를 출력
		System.out.println(arr.get(0));
	}
}
