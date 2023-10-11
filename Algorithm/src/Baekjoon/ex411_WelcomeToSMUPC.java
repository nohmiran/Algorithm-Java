package Baekjoon;

import java.util.Scanner;

public class ex411_WelcomeToSMUPC {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() - 1; // 0부터 시작하게 하기 위함.
        
        String label = "WelcomeToSMUPC"; // "WelcomeToSMUPC" 반복패턴 정의
        int labelLength = label.length(); // "WelcomeToSMUPC"의 길이 14
        int position = num % labelLength; // 패턴 내 위치 계산
        char result = label.charAt(position);
        
        System.out.println(result);
    }
}
