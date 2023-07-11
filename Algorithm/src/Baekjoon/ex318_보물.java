package Baekjoon;

import java.util.*;

public class ex318_보물 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 오름차순
        
        Integer[] arr2 = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2, Comparator.reverseOrder()); // 내림차순

        for (int i = 0; i < num; i++) {
            answer += arr[i] * arr2[i];
        }
        System.out.println(answer);
    }
}
