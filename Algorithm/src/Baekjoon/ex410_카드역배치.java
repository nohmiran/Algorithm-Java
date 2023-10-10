package Baekjoon;

import java.util.*;

public class ex410_카드역배치 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] card = new int[21];
        
        for (int i = 1; i < 21; i++) {
            card[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            for (int j = 0; j <= (end - start) / 2; j++) {
                int temp = card[start + j];
                card[start + j] = card[end - j];
                card[end - j] = temp;
            }
        }
        for (int i = 1; i < 21; i++) {
            System.out.print(card[i] + " ");
        }
    }
}
