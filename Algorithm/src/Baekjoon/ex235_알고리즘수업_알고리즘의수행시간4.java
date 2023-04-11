package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex235_알고리즘수업_알고리즘의수행시간4 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());

        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);
    }
}
