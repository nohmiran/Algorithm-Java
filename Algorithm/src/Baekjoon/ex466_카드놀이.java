package Baekjoon;

import java.util.*;

public class ex466_카드놀이 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        int[] playerA = new int[10]; 
        int[] playerB = new int[10];
        char winner = 'D';

        for (int i = 0; i < 10; i++) {
            playerA[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            playerB[i] = sc.nextInt();
        }

        int scoreA = 0;
        int scoreB = 0;
        int draw = 0;

        for (int i = 0; i < 10; i++) {
            if (playerA[i] > playerB[i]) {
                scoreA += 3;
                winner = 'A';
            } else if (playerA[i] < playerB[i]) {
                scoreB += 3;
                winner = 'B';
            } else {
                scoreA++;
                scoreB++;
                draw++;
            }
        }

        System.out.println(scoreA + " " + scoreB);

        if (scoreA > scoreB) {
            winner = 'A';
        } else if (scoreA < scoreB) {
            winner = 'B';
        }
        System.out.println(winner);
    }
}
