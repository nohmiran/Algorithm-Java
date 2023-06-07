package Baekjoon;

import java.util.Scanner;

public class ex286_123더하기 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] arr = new int[11];
        arr[1] = 1; // nums[1] -> (1) - 1가지
        arr[2] = 2; // nums[2] -> (1+1, 2) - 2가지
        arr[3] = 4; //nums[3] ->  (1+1+1, 1+2, 3) - 4가지
        // nums[4] -> (1+1의 총케이스, 2+2의 총케이스, 3+3의 총케이스) = 7
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            for (int j = 4; j <= num; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
            }
            System.out.println(arr[num]);
        }
    }
}
