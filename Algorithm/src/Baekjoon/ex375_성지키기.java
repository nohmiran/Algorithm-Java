package Baekjoon;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = 0;
        int y = 0;

        char[][] map = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }
        
        for (int i = 0; i < n; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) {
                x++;
            }
        }
        
        for (int j = 0; j < m; j++) {
            boolean hasGuard = false;
            for (int i = 0; i < n; i++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) {
                y++;
            }
        }
        
        // 추가해야 하는 경비원의 최솟값 출력
        System.out.println(Math.max(x, y));
    }
}
