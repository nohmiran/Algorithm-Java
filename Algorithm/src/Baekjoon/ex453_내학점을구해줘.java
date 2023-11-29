package Baekjoon;

import java.util.Scanner;

public class ex453_내학점을구해줘 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int semester = sc.nextInt(); // 학기의 수

        for (int i = 0; i < semester; i++) { // 학기별 처리
            int curSemester = sc.nextInt(); // 현재 학기에 들은 과목 수
            int totalGrade = 0; // 총 학점
            double sumGrade = 0.0; // 가중 평점 합

            for (int j = 0; j < curSemester; j++) { // 과목별 처리
                int subject = sc.nextInt();
                double grade = sc.nextDouble();

                totalGrade += subject;
                sumGrade += subject * grade;
            }
            double gpa = sumGrade / totalGrade; // 현재 학기의 평균 평점
            System.out.printf("%d %.1f\n", totalGrade, gpa);
        }
    }
}
