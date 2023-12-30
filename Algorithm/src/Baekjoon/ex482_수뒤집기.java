package baekjoon;

import java.io.*;

public class ex482_수뒤집기 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {
			String input = br.readLine();
			String reverse = "";
            
			for (int j = input.length() - 1; j >= 0; j--) {
				reverse += input.charAt(j);
			}

			int sum = Integer.parseInt(input) + Integer.parseInt(reverse);
			String str = Integer.toString(sum);
			boolean check = true;

			for (int j = 0; j < str.length() / 2; j++) {
				char first = str.charAt(j);
				char last = str.charAt(str.length() - j - 1);

				if(first != last) {
					check = false;
					break;
				}
			}
			if (check) {
                bw.write("YES" + "\n");
			} else {
                bw.write("NO" + "\n");
		    }
        }
		bw.flush();
		bw.close();
	}
}
