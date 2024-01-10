package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex493_타임머신 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int[] time = new int[3];
        int outOfRange = 0; // 범위 초과

        for (int i = 0; i < 3; i++) {

            time[i] = Integer.parseInt(st.nextToken());
            if (time[i] > 12 || time[i] < 1) {
                outOfRange++;
            }
            if (time[i] >= 60) {
                System.out.println(0);
                return;
            }
        }
        int count = 2 * (time.length - outOfRange);

        System.out.println(count);
    }
}
