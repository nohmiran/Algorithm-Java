package Baekjoon;

import java.io.*;
import java.util.*;

public class ex274_삼각형과세변 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0 && num3 == 0) {
                return;
            }

            int max = Math.max(num1, Math.max(num2, num3));
            int sum = num1 + num2 + num3;
            if (sum - max > max ) {
                if (num1 == num2 && num2 == num3) { // 모든 변이 같다면
                    System.out.println("Equilateral");
                } else if ((num1 == num2 && num2 != num3) || (num2 == num3 && num3 != num1) || (num3 == num1 && num1 != num2)) { // 두 변만 같다면
                    System.out.println("Isosceles");
                } else if (num1 != num2 && num2 != num3) { // 세 변이 모두 다르다면
                    System.out.println("Scalene");
                }
            } else { // 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우
                System.out.println("Invalid");
            }
        }
    }
}
