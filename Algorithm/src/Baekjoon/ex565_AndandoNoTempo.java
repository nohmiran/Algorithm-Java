package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex565_AndandoNoTempo {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.print("S");
        } else if (arr[2] == arr[0] + arr[1]) {
            System.out.print("S");
        } else {
            System.out.print("N");
        }
    }
}
