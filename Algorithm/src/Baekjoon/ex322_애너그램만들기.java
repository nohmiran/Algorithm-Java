package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex322_애너그램만들기 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < str1.length(); i++) a[str1.charAt(i) - 'a']++;
        for (int i = 0; i < str2.length(); i++) b[str2.charAt(i) - 'a']++;

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(a[i] - b[i]);
        }
        System.out.println(count);
    }
}
