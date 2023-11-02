package Baekjoon;

import java.util.Scanner;

public class ex427_타자연습 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String leftHand = "qwertyasdfgzxcvb";
        String rightHand = "uiophjklmn";

        int left = 0;
        int right = 0;
        int space = 0;
        int shift = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (leftHand.contains(String.valueOf(ch)) || leftHand.contains(String.valueOf(Character.toLowerCase(ch)))) {
                left++;
            } else if (rightHand.contains(String.valueOf(ch)) || rightHand.contains(String.valueOf(Character.toLowerCase(ch))) ) {
                right++;
            }
            if (ch == ' ') {
                space++;
            } else if (Character.isUpperCase(ch)) {
                shift++;
            }
        }

        for (int j = 0; j < space; j++) {
            if (right < left) {
                right++;
            } else {
                left++;
            }
        }

        for (int k = 0; k < shift; k++) {
            if (right < left) {
                right++;
            } else {
                left++;
            }
        }

        System.out.println(left + " " + right);
    }
}
