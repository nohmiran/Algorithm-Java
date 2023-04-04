package Baekjoon;

import java.util.Scanner;

public class ex228_너의평점은 {
  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        double average = 0; // 학점 * 과목평점
        double allScore = 0; // 총학점

        for (int i = 0; i < 20; i++) {
            
            String title = scanner.next(); // 과목
            double score = scanner.nextDouble(); // 학점
            String grade = scanner.next(); // 평점

            if (grade.equals("A+")){
                average += score * 4.5;
                allScore += score;
            } else if (grade.equals("A0")) {
                average += score * 4.0;
                allScore += score;
            }else if (grade.equals("B+")) {
                average += score * 3.5;
                allScore += score;
            }else if (grade.equals("B0")) {
                average += score * 3.0;
                allScore += score;
            }else if (grade.equals("C+")) {
                average += score * 2.5;
                allScore += score;
            }else if (grade.equals("C0")) {
                average += score * 2.0;
                allScore += score;
            }else if (grade.equals("D+")) {
                average += score * 1.5;
                allScore += score;
            }else if (grade.equals("D0")) {
                average += score * 1.0;
                allScore += score;
            }else if (grade.equals("F")) {
                average += score * 0.0;
                allScore += score;
            }
        }

            System.out.printf("%.6f", average / allScore); // 소수점 7번째 자리를 반올림
    }
}
