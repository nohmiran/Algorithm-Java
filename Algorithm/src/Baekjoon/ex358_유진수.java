package Baekjoon;

import java.util.Scanner;

public class ex358_유진수 {
  
    public static void main(String[] args) {

        // ﻿요즘 유진수가 부르는 ETA에 ㅃㅏ졌는디 ㅋ
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();

        String newjeans = "NO";

        if (length > 1) {
            for (int i = 1; i < length; i++) {
                int a = 1;
                int b = 1;

                for (int j = 0; j < i; j++) {
                    a *= (str.charAt(j) - '0');
                }

                for (int j = i; j < length; j++) {
                    b *= (str.charAt(j) - '0');
                }

                if (a == b) {
                    newjeans = "YES";
                    break;
                }
            }
        }
        System.out.println(newjeans);
    }
}
