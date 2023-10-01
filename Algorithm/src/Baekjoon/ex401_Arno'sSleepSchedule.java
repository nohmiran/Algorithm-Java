package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex401_Arno'sSleepSchedule {
    
  public static void main(String[] args) throws IOException {
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = 0;
    int test = Integer.parseInt(br.readLine());
      
    if (test >= 20 && test <= 23) {
      result = 24 - test;
      result += Integer.parseInt(br.readLine());
    } else {
      result = Integer.parseInt(br.readLine()) - test;
    }
    System.out.println(result);
  }
}
