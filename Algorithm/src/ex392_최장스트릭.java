package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex392_최장스트릭 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int count = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(input[i]);
            if (s == 0) {
                result = Math.max(count, result);
                count = 0;
            } else {
                count++;
            }
        }
        result = Math.max(count, result);
        System.out.println(result);
    }
}
