package Baekjoon;

import java.io.*;
import java.util.*;

public class ex376_학점계산프로그램 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        int count = 0;
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65) {
                count++;
                if (str.charAt(i) == 'F') {
                    continue;
                } else {
                    sum += (69 - str.charAt(i));
                }
            } else {
                sum += 0.5;
            }
        }
        System.out.println(sum / count);
    }
}
