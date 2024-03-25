package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex556_체스초보브실이 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[8];
        for (int i = 0; i < 8; i++) {
            str[i] = br.readLine();
        }

        int sum = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char object = str[i].charAt(j);
                if (object == '.') {
                    continue;
                }
                String strObject = String.valueOf(object);
                if ((int) object >= 65 && (int) object <= 90) { // 대문자 +
                    if (strObject.equalsIgnoreCase("K")) {
                        sum += 0;
                    } else if (strObject.equalsIgnoreCase("P")) {
                        sum += 1;
                    } else if (strObject.equalsIgnoreCase("N") || strObject.equalsIgnoreCase("B")) {
                        sum += 3;
                    } else if (strObject.equalsIgnoreCase("R")) {
                        sum += 5;
                    } else {
                        sum += 9;
                    }
                } else { // 소문자 -
                    if (strObject.equalsIgnoreCase("K")) {
                        sum -= 0;
                    } else if (strObject.equalsIgnoreCase("P")) {
                        sum -= 1;
                    } else if (strObject.equalsIgnoreCase("N") || strObject.equalsIgnoreCase("B")) {
                        sum -= 3;
                    } else if (strObject.equalsIgnoreCase("R")) {
                        sum -= 5;
                    } else {
                        sum -= 9;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
