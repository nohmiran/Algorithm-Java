package Baekjoon;

import java.util.Scanner;

public class ex306_입실관리 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            String name = sc.next(); // 입실자 이름쓰
            
            System.out.println(name.toLowerCase()); // 소문자로 출력
        }
    }
}
