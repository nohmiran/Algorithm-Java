package Baekjoon;

import java.util.*;

public class ex525_MBTI {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        int count = 0;
        
        for(int i = 0; i < num; ++i) {
            if(sc.nextLine().equals(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
