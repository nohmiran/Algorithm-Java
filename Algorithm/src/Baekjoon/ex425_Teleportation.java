package Baekjoon;

import java.util.Scanner;

public class ex425_Teleportation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startPoint = sc.nextInt();  // 시작 지점
        int endPoint = sc.nextInt(); // 끝 지점

        // 두 가지 후보 점(x, y)의 좌표 입력 받기
        int x = sc.nextInt();
        int y = sc.nextInt();

        // test 1: 시작 지점과 끝 지점 사이의 거리 계산
        int test1 = Math.abs(endPoint - startPoint);

        // test 2: 시작 지점에서 x로 이동한 거리와 y에서 끝 지점으로 이동한 거리 합산
        int test2 = Math.abs(startPoint - x) + Math.abs(endPoint - y);

        // test 3: 시작 지점에서 y로 이동한 거리와 x에서 끝 지점으로 이동한 거리 합산
        int test3 = Math.abs(startPoint - y) + Math.abs(endPoint - x);

        int result = Math.min(test1, Math.min(test2, test3)); // 가장 짧은 이동 거리

        System.out.print(result);
    }
}
