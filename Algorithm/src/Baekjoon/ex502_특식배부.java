package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex502_특식배부 {
    
  public static void main(String[] agrs) throws IOException {
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int sum = 0;
      
    for (int i = 0; i < 3; i++) {
      int m = Integer.parseInt(st.nextToken());
      if (n > m) { 
          sum += m;
      } else {
          sum += n;
      }
    }
    System.out.println(sum);
  }
}
