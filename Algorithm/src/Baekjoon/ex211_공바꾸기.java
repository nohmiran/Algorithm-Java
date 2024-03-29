package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex211_공바꾸기 {
	
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int[] param = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = param[0], M = param[1];
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++) {
        
        	int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int temp = arr[input[0]-1];
            arr[input[0]-1] = arr[input[1]-1];
            arr[input[1]-1] = temp;
        }

        for(int i=0; i<N; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
    }
}