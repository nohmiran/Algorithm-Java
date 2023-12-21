package Baekjoon;

import java.io.*;
import java.util.*;

public class ex473_크림빵 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int t = 0;
            for (int j = 1; j <= k; j++) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    t++;
                    }
            }
            if (t < p) {
                result++;
            }
        }
        System.out.print(result);
    }
}
