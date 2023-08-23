package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex360_Hashing {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long result = 0;
        long pow = 1;

        int strLength = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < strLength; i++) {
            result += (str.charAt(i) - 96) * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result % 1234567891);
    }
}
