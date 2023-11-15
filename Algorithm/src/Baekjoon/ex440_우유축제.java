package Baekjoon;

import java.util.*;

public class ex440_우유축제 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        
        for (int i = 0; i < num; i++){
            if (sc.nextInt() == result % 3){
                result++;
                }
            }
        System.out.println(result);
    }
}
