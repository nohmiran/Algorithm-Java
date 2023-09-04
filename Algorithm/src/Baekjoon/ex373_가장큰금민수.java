package Baekjoon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (true) {
            String str = String.valueOf(num);
            boolean isTrue = true;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                    continue;
                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println(str);
                break;
            } else {
                num--;
            }
        }
    }
}
