package Baekjoon;

import java.util.*;

public class ex284_대지 {
    
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr_x = new int[num];
        int[] arr_y = new int[num];
        
        for(int i = 0; i < num; i++) {
            arr_x[i] = sc.nextInt();
            arr_y[i] = sc.nextInt();
        }

        Arrays.sort(arr_x);
        Arrays.sort(arr_y);
        
        System.out.println((arr_x[num - 1] - arr_x[0]) * (arr_y[num - 1] - arr_y[0]));
    }
}
