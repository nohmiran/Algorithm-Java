package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex554_가계부Easy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[] arr = new long[n + 1];

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int idx = Integer.parseInt(st.nextToken());
                int addValue = Integer.parseInt(st.nextToken());
                arr[idx] += addValue;
            } else {
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                long result = 0;
                for (int j = start; j <= end; j++) {
                    result += arr[j];
                }
                System.out.println(result);
            }
        }
    }
}
