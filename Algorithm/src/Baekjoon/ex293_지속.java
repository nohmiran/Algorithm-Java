package Baekjoon;

import java.util.Scanner;
 
public class ex293_지속 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int count = 0;
 
        while(str.length != 1){
            
            int num = 1;
            
            for(int i = 0; i < str.length; i++){
                
                num *= Integer.parseInt(str[i]);
            }
            
            str = Integer.toString(num).split("");                                                       
            count++;
        } 
        System.out.print(count);
    }
}
