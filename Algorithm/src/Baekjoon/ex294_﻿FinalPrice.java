package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex294_FinalPrice {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int result = 0;

        while(num-- > 0) {
            result += Integer.parseInt(br.readLine());
        }
        System.out.println(result);
    }
}
