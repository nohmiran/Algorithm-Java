package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex552_알파벳거리 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (test-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            bw.write("Distances: ");

            for (int i = 0; i < str1.length(); i++) {
                int a = str1.charAt(i)- 'A' + 1;
                int b = str2.charAt(i)- 'A' + 1;

                if (a > b) {
                    bw.write((b + 26 - a) + " ");
                } else {
                    bw.write((b - a) + " ");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
