package Baekjoon;

import java.util.Scanner;

public class ex472_경기결과 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		int round = sc.nextInt();
        int winnerA = 0;
        int winnerB = 0;
        
		for(int i = 0; i < round; i++) {
			int scoreA = sc.nextInt();
            int scoreB = sc.nextInt();
			if(scoreA > scoreB) {
                winnerA++;
            } else if(scoreA < scoreB) {
                winnerB++;
            }
		}
		System.out.println(winnerA + " " + winnerB);
	}
}
