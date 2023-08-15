package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex354_몇개고 {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
    
		int time = Integer.parseInt(st.nextToken());
		int drink = Integer.parseInt(st.nextToken());
        
		if(drink == 0 && time >= 12 && time <= 16) {
      System.out.print(320);
    }
		else {
      System.out.print(280);
	  }
     br.close(); 
  }
}
