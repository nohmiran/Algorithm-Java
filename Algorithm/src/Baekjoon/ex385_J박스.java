package Baekjoon;

import java.util.Scanner;

public class ex385_J박스 {
    
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
      
    for (int i = 0; i < num; i++) {
      int box = sc.nextInt();
      String result = "";
      for (int j = 0; j < box; j++) {
          if (j == 0 || j == box - 1) {
            result += "#".repeat(box) + "\n";
          } else {
            result += "#" + "J".repeat(box - 2) + "#\n";
          }
      }
      System.out.println(result);
    }
  }
}
