package Baekjoon;

import java.util.Scanner;

public class ex291_블랙잭 {
    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

    int result = 0;
    
    for (int a = 0; a < N; a++) {
      for (int b = 1; b < N - a; b++) {
        for (int c = 1; c < N - a - b; c++) {
          int sum = arr[a] + arr[a + b] + arr[a + b + c];
          if (sum <= M && result < sum) {
            result = sum;
          }
        }
      }
    }
    System.out.println(result);
  }
}
