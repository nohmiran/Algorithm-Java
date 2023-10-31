package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex426_대표값 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arr = new int[10];
        int[] count = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count[i]++;
            }
        }

        int idx = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[idx] < count[i]) {
                idx = i;
            }
        }

        System.out.println(sum / 10);
        System.out.println(arr[idx]);
    }
}
