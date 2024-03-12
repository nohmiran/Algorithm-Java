package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex545_FYI {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        if (str.startsWith("555")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
