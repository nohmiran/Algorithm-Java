package Baekjoon;

import java.util.Scanner;

public class ex212_IdentifyingTea{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        int test = sc.nextInt();
        int result = 0;
        
        for(int i = 0; i < 5; i++){
        
            if(sc.nextInt() == test){
        
                result += 1;
            }
        }
        System.out.println(result);
    }
}
