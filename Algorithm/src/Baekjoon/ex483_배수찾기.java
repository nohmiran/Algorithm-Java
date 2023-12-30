package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex483_배수찾기 {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		while (true) {
			int testNum = Integer.parseInt(br.readLine());
            
			if (testNum == 0){
				break;
            }
			String result = (testNum % num == 0) 
                            ? testNum + " is a multiple of " + num + "." 
                            : testNum + " is NOT a multiple of " + num + ".";

			System.out.println(result);
		}
	}
}
