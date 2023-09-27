package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex397_Конвейер {
    
  public static void main(String[] args) throws IOException {
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
      
    int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
    System.out.println(sum < 0 ? "Left" : sum == 0 ? "Stay" : "Right");
  }
}
