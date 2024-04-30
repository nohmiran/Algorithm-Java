package Baekjoon;

import java.util.*;

public class ex571_Dedupe {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());

        while(test-- > 0) {
            String[] str = sc.nextLine().split("");
            String x = str[0];
            String z = x;
            for(String s : str) {
                if(!x.equals(s)) {
                    x = s;
                    z += x;
                }
            }
            System.out.println(z);
        }
    }
}
