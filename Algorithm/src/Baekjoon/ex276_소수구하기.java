package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex276_소수구하기 {
    
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        
        boolean[] prime = new boolean[end + 1];
        StringBuilder sb = new StringBuilder();
        
        // 증가하는 순서대로 소수 출력
        for(int i = 2; i <= end; i++){
            if(prime[i]) {
                continue;
            }

            if(i >= first) {
                sb.append(i).append("\n");
            }

            for(int j = i + i; j <= end; j += i){
                prime[j] = true;
            }
        }
        System.out.println(sb);
    }
}
