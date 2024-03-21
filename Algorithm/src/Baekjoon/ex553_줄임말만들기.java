package Baekjoon;

import java.io.*;

public class ex553_줄임말만들기 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[] = br.readLine().split(" ");
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("i") || arr[i].equals("pa") || arr[i].equals("te") || arr[i].equals("ni") || 
					arr[i].equals("niti") || arr[i].equals("a") || arr[i].equals("ali") || 
					arr[i].equals("nego") || arr[i].equals("no") || arr[i].equals("ili")) {
				if(i == 0) {
					String[] s = arr[0].split("");
					result += s[0].toUpperCase();
				}
			} else {
				String[] str = arr[i].split("");
				result += str[0].toUpperCase();
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
