package Baekjoon;

import java.util.Scanner;

public class ex312_체육은코딩과목입니다 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
          
            test += num * 90;
        }
      
        test %= 360;
      
        String result = ""; // 학생들이 보고 있는 방향
      
        switch (test) {
                
            case 0:
                result = "N";
                break;
                
            case 90:
                result = "E";
                break;
                
            case 180:
                result = "S";
                break;
                
            case 270:
                result = "W";
                break;
        }
        System.out.println(result);
    }
}
