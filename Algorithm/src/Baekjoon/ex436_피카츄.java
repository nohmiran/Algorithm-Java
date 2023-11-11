package Baekjoon;

import java.util.Scanner;

public class ex436_피카츄 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String pikachu = input.replaceAll("pi|ka|chu", " ");
        String result = pikachu.trim().isEmpty() ? "YES" : "NO";
        
        System.out.println(result);
    }
}
