package Baekjoon;

import java.util.Scanner;

public class ex313_공 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = 1;
        
        for(int i = 0; i < num; i++){
            // 컵의 위치를 바꾼 방법 X와 Y
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(result == x) {
                result = y;
            } else if(result == y){
                result = x;
            }
        }
        System.out.println(result);
    }
}
