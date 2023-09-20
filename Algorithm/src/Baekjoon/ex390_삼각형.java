package Baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ex390_삼각형 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        
        int weight = Integer.parseInt(input[0]);
        int height = Integer.parseInt(input[1]);
        sb.append(weight * height / 2);
        
        if (weight % 2 == 1 && height % 2 == 1) {
            sb.append(".5");
        } else {
            sb.append(".0");
        }
        System.out.print(sb);
    }
}
