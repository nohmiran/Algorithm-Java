package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex349_양말짝맞추기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[10];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 1) {
                bw.write(String.valueOf(i));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
