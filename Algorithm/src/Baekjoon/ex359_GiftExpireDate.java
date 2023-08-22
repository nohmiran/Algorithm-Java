package Baekjoon;

import java.io.*;
import java.util.*;

public class ex359_GiftExpireDate {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        while (num-- > 0) {
            String day = br.readLine();
            if (str.compareTo(day) <= 0) {
                count++;
            }
        }
        sb.append(count);

        System.out.print(sb);
    }
}
