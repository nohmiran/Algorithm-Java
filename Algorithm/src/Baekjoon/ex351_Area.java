package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex351_Area {
    
  public static void main(String[] args) throws IOException {
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int result = 0;
      
    for (int i = 0; i < test; i++) {
      st = new StringTokenizer(br.readLine());
      result = Math.max(result, Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
    }
    System.out.println(result);
  }
}
