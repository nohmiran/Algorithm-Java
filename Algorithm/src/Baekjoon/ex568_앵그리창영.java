package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex568_앵그리창영 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int num = Integer.parseInt(st.nextToken()); 
		int width = Integer.parseInt(st.nextToken());  
		int hight = Integer.parseInt(st.nextToken());  

		for (int i = 1; i <= num; i++) {
			int size = Integer.parseInt(br.readLine()); 

			if((width * width) + (hight * hight) >= (size * size)) {
				bw.write("DA" + "\n");
			} else {
				bw.write("NE" + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
