package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class ex514_카드뽑기 {

    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());
        int k = parseInt(st.nextToken());
        
        System.out.println(Math.min(m, k) + Math.min(n - m, n - k));
    }
}
