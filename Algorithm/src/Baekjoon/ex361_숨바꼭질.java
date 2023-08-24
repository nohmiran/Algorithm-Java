package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex361_숨바꼭질 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] visited = new int[100001];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);
        visited[n] = 0;
        while(!queue.isEmpty()){
            if ((n = queue.poll()) == k){
                System.out.println(visited[n]);
                break;
            }
            if (n-1 >= 0 && visited[n-1] == 0){
                queue.add(n-1);
                visited[n-1] = visited[n]+1;
            }
            if (n+1 <= 100000 && visited[n+1] == 0){
                queue.add(n+1);
                visited[n+1] = visited[n]+1;
            }
            if (n*2 <= 100000 && visited[n*2] == 0){
                queue.add(n*2);
                visited[n*2] = visited[n]+1;
            }
        }
    }
}
