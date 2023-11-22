package Baekjoon;

import java.io.*;
import java.util.*;
 
public class ex444_AdivisionBminus2 {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        sb.append(num1 / num2 + ".");
        num1 = 10 * (num1 - num2 *(num1 / num2));
        int t = 1500;
        while (t-- > 0) {
            sb.append(num1 / num2 + "");
            num1 = 10 * (num1 - num2 *(num1 / num2));
        }
        System.out.println(sb.toString());
    }
}
