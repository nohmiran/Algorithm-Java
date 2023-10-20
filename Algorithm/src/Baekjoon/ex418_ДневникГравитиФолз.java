package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex418_ДневникГравитиФолз {
    
  public static void main(String[] args) throws IOException {
      
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = null;
    tokenizer = new StringTokenizer(reader.readLine());
    int paperWidth = Integer.parseInt(tokenizer.nextToken());
    int paperHeight = Integer.parseInt(tokenizer.nextToken());
    tokenizer = new StringTokenizer(reader.readLine());
    int totalLetters = Integer.parseInt(tokenizer.nextToken());
    int letterWidth = Integer.parseInt(tokenizer.nextToken());
    int letterHeight = Integer.parseInt(tokenizer.nextToken());
    
    if (paperWidth < letterWidth || paperHeight < letterHeight) {
      System.out.println("-1");
      return;
    }
    
    int letters = (paperWidth / letterWidth) * (paperHeight / letterHeight);
    int totalPages = (int) Math.ceil((double) totalLetters / letters);
    System.out.println(totalPages);
  }
}
