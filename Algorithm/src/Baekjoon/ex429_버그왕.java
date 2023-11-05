package Baekjoon;

import java.io.*;

public class ex429_버그왕 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {

            while (str.contains("BUG")) {
                str = str.replaceAll("BUG", "");
            }
            sb.append(str + "\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
