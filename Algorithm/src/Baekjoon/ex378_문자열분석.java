package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while ((str = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int number = 0;
            int blank = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ('A' <= c && c <= 'Z') {
                    upper++;
                } else if('a' <= c && c <= 'z') {
                    lower++;
                } else if (c == ' '){
                    blank++;
                } else {
                    number++;
                }
            }
            System.out.printf("%d %d %d %d\n", lower, upper, number, blank);
        }
    }
}
