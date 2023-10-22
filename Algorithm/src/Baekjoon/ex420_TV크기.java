package Baekjoon;

import java.util.Scanner;

public class ex420_TV크기 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int diagonal = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();

        double diagonalRate = Math.sqrt((double) (diagonal * diagonal) / (height * height + width * width));

        System.out.println((int) Math.floor(height * diagonalRate)); // TV 높이
        System.out.println((int) Math.floor(width * diagonalRate)); // TV 너비
    }
}
