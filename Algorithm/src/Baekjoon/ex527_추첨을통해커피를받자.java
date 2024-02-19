package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex527_추첨을통해커피를받자 {
    
    public static void main(String[] agrs) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int[] arr = new int[9];

        boolean check = true;

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > score[i]) {
                check = false;
                break;
            } else {
                sum += arr[i];
            }
        }

        if (check) {
            if (sum >= 100) {
                System.out.println("draw");
            } else {
                System.out.println("none");
            }
        } else {
          System.out.println("hacker");
        }
    }
}
