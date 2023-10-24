package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex422_숫자놀이 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }
            while (true) { // 한 자리 수가 될 때까지 반복해서 누적합산
                int sum = 0;

                for (int i = 0; i < input.length(); i++) { // 숫자쓰 한 개씩~
                    sum += input.charAt(i) - '0';
                }
                input = String.valueOf(sum);

                if (sum < 10) { // 한 자리 수가 된다면 break
                    sb.append(sum).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
