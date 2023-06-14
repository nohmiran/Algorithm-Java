package Baekjoon;

import java.util.Scanner;

public class ex295_최대공약수와최소공배수 {
    
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd = 0; // 최대공약수
    int lcm = 0; // 최소공배수

    for (int i = 1; i <= Math.min(a, b); i++) { // Math.min(a, b) : a와 b 중 작은 값보다 작거나 같을 때까지
      if ((a % i == 0) && (b % i == 0)) { // 만약 a % i 의 나머지가 0이면서 b % i 의 나머지가 0이라면
        gcd = i; // 최대공약수는 i
      }
    }

    lcm = gcd * (a / gcd) * (b / gcd); // 최소공배수 = 최대공약수 * (a / 최대공약수) * (b / 최대공약수)

    System.out.println(gcd);
    System.out.println(lcm);
  }
}
