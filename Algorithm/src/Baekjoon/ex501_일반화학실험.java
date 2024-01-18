package Baekjoon;

import java.util.*;
 
public class ex501_일반화학실험 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double previous = sc.nextDouble(); // 첫 번째 온도를 이전 온도로 초기화
        
        while(true){
            double current = sc.nextDouble(); // 현재 측정된 온도 저장
            
            if (current == 999){ // 사용자가 999를 입력하면 종료
                break;
            }
            
            System.out.printf("%.2f\n", current - previous); // 현재 온도와 이전 온도의 차이
            
            previous = current; // 다음 비교를 위해 현재 온도를 이전 온도 변수에 저장
        }
    }
}
