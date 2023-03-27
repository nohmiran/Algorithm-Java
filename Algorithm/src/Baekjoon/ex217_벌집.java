package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex217_벌집 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int meter = 1;
        int range = 2;

        if (num == 1) {
            System.out.println(1);
        
        } else {
            while (range <= num) {
                range = range + (6 * meter);
                meter++;
            }
            System.out.println(meter);
        }
    }
}
