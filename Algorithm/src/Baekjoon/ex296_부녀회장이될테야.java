package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex296_부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        // 입주 조건 : 
        // a층의 b호에 살려면 
        // 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
        while(test != 0) {
            test--;

            int floor = Integer.parseInt(br.readLine()); // 층
            int number = Integer.parseInt(br.readLine()); // 호

            int[][] arr = new int[floor + 1][number + 1];

            for(int i = 0; i < number + 1; i++){
                arr[0][i] = i;
            }

            for(int i = 1; i <= floor; i++){
                for(int j = 1; j <= number; j++){
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
            System.out.println(arr[floor][number]);
        }
    }
}
