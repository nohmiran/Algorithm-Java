package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex471_GumGumforJayJay {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        while (true) {
            String temp = br.readLine();
            if (temp == null) {
               break;
            }
            count++;
        }
        System.out.println(count);
    }
}
