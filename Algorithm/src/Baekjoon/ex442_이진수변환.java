package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex442_이진수변환 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Long.toBinaryString(Long.parseLong(br.readLine())));
    }
}
