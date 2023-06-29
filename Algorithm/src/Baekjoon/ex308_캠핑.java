package Baekjoon;

import java.util.Scanner;

public class ex308_캠핑 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        while (true) {
            int allow = sc.nextInt(); // 강산쓰가 캠핑장을 사용할 수 있는 날짜
            int total = sc.nextInt(); // 캠핑 이용가능 전체 날짜
            int vacation = sc.nextInt(); // 강산쓰 휴가 날짜
            int result = 0; // 강산쓰가 캠핑장을 최대 며칠 사용할 수 있는지
            
            if (allow == 0 && total == 0 && vacation == 0) {
                break;
            }

            result += vacation / total * allow;
            vacation %= total;
            if(vacation > allow) {
                result += allow;
            } else {
                result += vacation;
            }
            System.out.println("Case " + ++i + ": " + result);
        }
    }
}
