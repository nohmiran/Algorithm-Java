package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex470_TimetoDecompress {

  public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < num; i++) {
                result.append(str);
            }
            bw.write(result.toString() + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
