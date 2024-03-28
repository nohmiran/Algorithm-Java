package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex559_시각 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String k = st.nextToken();

        int count = 0;
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String hour = String.valueOf(h);
                    String minute = String.valueOf(m);
                    String second = String.valueOf(s);
                    if (h < 10 || m < 10 || s < 10) {
                        hour = "0" + hour;
                        minute = "0" + minute;
                        second = "0" + second;
                    }
                    if (hour.contains(k) || minute.contains(k) || second.contains(k)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        br.close();
    } 
}
