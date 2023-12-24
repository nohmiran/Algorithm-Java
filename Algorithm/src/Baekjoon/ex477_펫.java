package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex477_펫 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int properWeight = Integer.parseInt(st.nextToken()); // 적정 체중
			int actualWeight = Integer.parseInt(st.nextToken()); // 실제 체중
			
			if(properWeight == 0 && actualWeight == 0) {
        break;
      }
			int count = 0;
			
			while(true) {
				st = new StringTokenizer(br.readLine());
				String str = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				if (str.equals("#") && n == 0) {
                    break;
                }
				if (str.equals("E")) {
                    actualWeight -= n;
                }
				if (str.equals("F")) {
                    actualWeight += n;
                }
				if (actualWeight <= 0) {
					count = 1;
				}
			}
			if (count == 1){
				System.out.println(num + " RIP");
			} else {
				if((properWeight / 2) < actualWeight && actualWeight < (properWeight * 2)) {
				System.out.println(num + " :-)");
				} else {
				System.out.println(num + " :-(");
				}
			}
			num++;
		}
	}
}
