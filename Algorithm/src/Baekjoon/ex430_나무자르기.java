package Baekjoon;

import java.util.Scanner;

public class ex430_나무자르기 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 나무 개수
        int m = sc.nextInt(); // 나무 길이
        int[] arr = new int[num]; // 각 나무의 길이를 저장하는 배열

        int min = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i]; // 나무 최대 길이 update
            }
        }
        while (min < max) {
            int mid = (min + max) / 2; // 최소, 최대 길이 중간 값 계산
            long count = 0;
            
            for (int h : arr) {
                if (h - mid > 0) {
                    count += (h - mid);
                }
            }
            if (count < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
