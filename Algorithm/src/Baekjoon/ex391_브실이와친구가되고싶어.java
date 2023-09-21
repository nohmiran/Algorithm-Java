package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex391_브실이와친구가되고싶어 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        k = k - x;
        x = k + x + x;

        int count = 0;
        for (int i = k; i <= x; i++) {
            if (i >= a && i <= b) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
