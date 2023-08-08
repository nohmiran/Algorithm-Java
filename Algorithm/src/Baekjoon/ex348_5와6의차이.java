package Baekjoon;

import java.util.Scanner;

public class ex348_5와6의차이 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
      
        int max = Integer.parseInt(input[0].replaceAll("5", "6")) + Integer.parseInt(input[1].replaceAll("5", "6"));
        int min = Integer.parseInt(input[0].replaceAll("6", "5")) + Integer.parseInt(input[1].replaceAll("6", "5"));
      
        System.out.println(min + " " + max);
    }
}
