package Baekjoon;

import java.util.*;

public class ex438_등장하지않는문자의합 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int result = 0;
            boolean[] check = new boolean[26];
            String str = sc.next();
            for (int j = 0; j < str.length(); j++)
                check[str.charAt(j) - 'A'] = true;
            
            for (int j = 0; j < 26; j++) {
                if (!check[j]) {
                    result += 65 + j;
                }
            }
            System.out.println(result);
        }
    }
}
