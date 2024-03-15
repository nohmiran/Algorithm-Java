package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex547_푸앙이와종윤이 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = 100 - Integer.parseInt(st.nextToken());
        int B = 100 - Integer.parseInt(st.nextToken());

        int multiply = A * B;
        
        int division = multiply / 100; // 곱한 결과를 100으로 나눈 몫
        int rest = multiply % 100; // 곱한 결과를 100으로 나눈 나머지
        
        sb.append(A)
            .append(" ").append(B)
            .append(" ").append(100 - (A + B))
            .append(" ").append(multiply)
            .append(" ").append(division)
            .append(" ").append(rest
        ).append("\n");
        
        sb.append(division + (100 - (A + B))).append(" ").append(rest);
        
        System.out.println(sb.toString());
    }
}
