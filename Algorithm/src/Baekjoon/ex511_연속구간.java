package Baekjoon;

import java.util.*;
import java.io.*;

public class ex511_연속구간 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 3개의 여덟 자리 양의 정수를 처리
        for (int i = 0; i < 3; i++) {
            
            String str = br.readLine();
            int result = 1;
            // 각 자리에서 연속된 숫자의 개수를 저장하는 배열
            int[] arr = new int[str.length()]; 
            
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    result++;
                    arr[j] = result;
                } else {
                    result = 1;
                    arr[j] = result;
                }
            }
            // 오름차순 정렬 후 가장 긴 연속된 숫자의 개수를 얻음
            Arrays.sort(arr);
            int maxCount = arr[str.length() - 1];
            
            // 결과 append
            sb.append(maxCount + "\n");
        }
        System.out.println(sb);
    }
}
