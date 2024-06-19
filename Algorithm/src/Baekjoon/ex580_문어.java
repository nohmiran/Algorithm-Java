package Baekjoon;

import java.io.*;
import java.util.*;

public class ex580_문어 {
    
    static int n;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        boolean b = false;
        if (n % 2 == 1) {
            b = true;
            n--;
        }
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            if (n % 2 == 1) {
                sb.append("1").append(" ");
            } else {
                sb.append("2").append(" ");
            }
        }
        if (b) {
            sb.append("3");
        }
        System.out.println(sb.toString());
    }
}
