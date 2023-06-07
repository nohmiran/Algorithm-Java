package Baekjoon;

import java.util.Scanner;

public class ex285_네번째점 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] X = new int[4];
        int[] Y = new int[4];

        for(int i = 0; i < 3; i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        
        if(X[0] == X[1]) {
            X[3] = X[2];
        } else if(X[0] == X[2]) {
            X[3] = X[1];
        } else {
            X[3] = X[0];
        }

        if(Y[0] == Y[1]) {
            Y[3] = Y[2];
        } else if(Y[0] == Y[2]) {
            Y[3] = Y[1];
        } else {
            Y[3] = Y[0];
        }

        System.out.println(X[3] + " " + Y[3]);
    }
}
