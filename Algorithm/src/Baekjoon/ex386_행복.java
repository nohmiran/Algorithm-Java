package Baekjoon;

import java.util.*;
import java.io.*;

public class ex386_행복 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < num; i++){
            int temp = Integer.parseInt(st.nextToken());
            max = Math.max(temp, max);
            min = Math.min(temp, min);
        }
        System.out.println(max - min);
    }
}
