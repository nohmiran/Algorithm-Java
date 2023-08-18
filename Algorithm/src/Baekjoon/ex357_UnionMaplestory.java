package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ex357_UnionMaplestory {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] levels = new Integer[n];
        for (int i = 0; i < n; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(levels, Collections.reverseOrder());

        int totalLevel = 0;
        int totalBonus = 0;
        for (int i = 0; i < Math.min(n, 42); i++) {
            totalLevel += levels[i];
            if (levels[i] >= 250) {
                totalBonus += 5;
            } else if (levels[i] >= 200) {
                totalBonus += 4;
            } else if (levels[i] >= 140) {
                totalBonus += 3;
            } else if (levels[i] >= 100) {
                totalBonus += 2;
            } else if (levels[i] >= 60) {
                totalBonus += 1;
            }
        }
        System.out.println(totalLevel + " " + totalBonus);
    }
}
