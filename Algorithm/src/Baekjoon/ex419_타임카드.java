package Baekjoon;

import java.util.Scanner;

public class ex419_타임카드{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){ // 3명의 직원
            int startHour = sc.nextInt(); 
            int startMinute = sc.nextInt();
            int startSecond = sc.nextInt();
            int endHour = sc.nextInt();
            int endMinute = sc.nextInt();
            int endSecond = sc.nextInt();
            
            int start = (startHour * 3600) + (startMinute * 60) + startSecond;
            int end = (endHour * 3600) + (endMinute * 60) + endSecond; 
            int time = end - start;
            int hour = time / 3600;
            int minute = (time % 3600) / 60;
            int second = (time % 3600) % 60;
            
            System.out.println(hour + " " + minute + " " + second);
        }
    }
}
