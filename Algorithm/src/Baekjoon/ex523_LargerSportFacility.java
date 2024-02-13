package Baekjoon;

import java.util.Scanner;

public class ex523_LargerSportFacility {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            long a = sc.nextInt(); // TelecomParisTech의 길이
            long b = sc.nextInt(); // TelecomParisTech의 너비
            long c = sc.nextInt(); // Eurecom의 길이
            long d = sc.nextInt(); // Eurecom의 너비

            long areaTelecomParisTech = a * b; // TelecomParisTech의 면적
            long areaEurecom = c * d; // Eurecom의 면적

            if (areaTelecomParisTech > areaEurecom) {
                System.out.println("TelecomParisTech");
            } else if (areaTelecomParisTech < areaEurecom) {
                System.out.println("Eurecom");
            } else {
                System.out.println("Tie");
            }
        }
    }
}
