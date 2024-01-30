package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex512_택시거리 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        // 배열에 좌표 저장
        int[] coordinates = new int[4];
        int index = 0;

        // 각 행의 정보를 확인하면서 1의 위치를 저장하기 위한 반복문
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < x; j++) {
                if (("1").equals(st.nextToken())) { // 1이 등장하면 좌표 저장
                    coordinates[index++] = i;
                    coordinates[index++] = j;
                }
            }
        }

        // 택시 거리 계산
        int xDistance = Math.abs(coordinates[0] - coordinates[2]);
        int yDistance = Math.abs(coordinates[1] - coordinates[3]);

        System.out.println(xDistance + yDistance);
    }
}
