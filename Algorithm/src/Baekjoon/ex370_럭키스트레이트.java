package Baekjoon;

import java.util.Scanner;

public class ex370_럭키스트레이트 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < str.length() / 2; i++) {
            result += str.charAt(i) - '0';
        }

        for (int i = str.length() / 2; i < str.length(); i++) {
            result-= str.charAt(i) - '0';
        }

        if (result == 0) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
