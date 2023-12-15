package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex469_바이러스 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalComputer = Integer.parseInt(br.readLine()); // 총 컴퓨터의 개수
        int connectComputer  = Integer.parseInt(br.readLine()); // 네트워크상 직접 연결된 컴퓨터 수
        StringTokenizer st;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= totalComputer; i++) {
            graph.add(new ArrayList<>());
        }

        // 네트워크 상에서 직접 연결된 컴퓨터 입력 받기
        for (int i = 0; i < connectComputer; i++) {
            st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());

            // graph.get().add(): 양방향으로 컴퓨터 인접시킴
            graph.get(com1).add(com2);
            graph.get(com2).add(com1);
        }

        boolean[] visited = new boolean[totalComputer + 1]; // 각 컴퓨터의 감염 여부 저장 변수
        int count = 0;  // 바이러스에 감염된 컴퓨터

        Queue<Integer> queue = new LinkedList<>(); // 큐 초기화
        queue.add(1); // 1번 컴퓨터부터 시작~
        visited[1] = true; // 1번 컴퓨터 웜바이러스 감염 처리 (1번 컴퓨터는 이미 감염쓰)

        while (!queue.isEmpty()) {
            // queue.poll(): 큐의 첫번째 요소 반환 == 첫번째 요소를 꺼내서 현재 컴퓨터로 설정
            int currentComputer = queue.poll(); 
            for (int i = 0; i < graph.get(currentComputer).size(); i++) {
                // 현재 컴퓨터(currentComputer)와 연결된 다음 컴퓨터(i)를 가져옴
                int nextComputer = graph.get(currentComputer).get(i);
                if (!visited[nextComputer]) {
                    visited[nextComputer] = true; // 감염된 컴퓨터와 인접해있는 컴퓨터는 아묻따 감염
                    queue.add(nextComputer);
                    count++; // 감염 컴퓨터 1 증가
                }
            }
        }
        System.out.println(count);
    }
}
