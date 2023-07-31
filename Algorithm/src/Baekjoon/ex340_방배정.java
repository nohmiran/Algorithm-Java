package Baekjoon;

import java.util.Scanner;

public class ex340_방배정 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt(); // 최대 인원 수
        int result = 0;
        int[][] arr = new int[2][7];
        for(int i = 1; i <= num; i++) {
            int gender = sc.nextInt(); // 성별
            int grade = sc.nextInt(); // 학년
            arr[gender][grade]++;
        }
        for(int i = 0; i <= 1; i++) {
            for(int j = 1; j <= 6; j++) {
                if(arr[i][j] % max == 0) {
                    result += arr[i][j] / max;
                }
                else {
                    result += arr[i][j] / max + 1;
                }
            }
        }
        System.out.println(result);
    }
}
