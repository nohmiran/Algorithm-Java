package Baekjoon;

import java.io.*;

public class ex517_니모를찾아서 {

     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("EOI")) {
            if (input.toLowerCase().contains("nemo")) {
                bw.write("Found\n");
            } else {
                bw.write("Missing\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
