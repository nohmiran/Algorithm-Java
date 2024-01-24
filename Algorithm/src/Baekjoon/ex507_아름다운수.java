package Baekjoon;

import java.io.*;
import java.util.*;

public class ex507_아름다운수 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            Set<Integer> numberSet = new HashSet<>();
            String number = br.readLine();

            for (int i = 0; i < number.length(); i++) {
                numberSet.add(number.charAt(i) - '0');
            }
            bw.write(numberSet.size() + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
