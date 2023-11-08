package Baekjoon;

import java.util.*;

public class ex433_핸드폰번호궁합 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1. 두 사람의 핸드폰 번호 입력
        String A = sc.next();
        String B = sc.next();

        // 2. 두 번호를 번갈아가며 합쳐서 저장
        String result = "";

        // 3. A와 B의 핸드폰 번호에서 한 글자씩 번갈아가면서 C에 추가
        for (int i = 0; i < A.length(); i++) {
            result += A.charAt(i) + "" + B.charAt(i) + "";
        }
        // C가 두 자리 이상이면 한 자리일 때까지 반복
        while (result.length() > 2) { 
            String D = "";

            // C의 각 인접한 두 숫자를 더한 값의 일의 자리를 D에 추가
            for (int i = 0; i < result.length() - 1; i++) {
                D += (char)((((result.charAt(i) - '0') + (result.charAt(i + 1) - '0')) % 10) + '0');
            }

            result = D;
        }
        System.out.println(result);
    }
}
