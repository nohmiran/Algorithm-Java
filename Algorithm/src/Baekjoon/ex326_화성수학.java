package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex326_화성수학 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); // 테스트 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test; i++) {
            String[] line = br.readLine().split(" ");
            double num = Double.parseDouble(line[0]);
            for (int j = 1; j < line.length; j++) {
                if (line[j].equals("@")) num *= 3; // @는 3을 곱하고
                else if (line[j].equals("%")) num += 5; // %는 5를 더하며
                else if (line[j].equals("#")) num -= 7; // #는 7을 빼는 연산자
            }
            sb.append(String.format("%.2f", num)).append("\n"); // 소수점 둘째 자리까지 출력
        }
        System.out.println(sb);
    }
}
