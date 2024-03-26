package Baekjoon;

import java.io.*;
import java.util.*;

public class ex557_알고리즘수업-버블정렬1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int last = arr.length - 1; last > 0; last--) {
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    cnt++;
                    if (cnt == k) {
                        System.out.println(Math.min(arr[i], arr[i + 1]) + " " + Math.max(arr[i], arr[i + 1]));
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
