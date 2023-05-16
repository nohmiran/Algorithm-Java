package Bakjoon;

import java.util.*;
import java.io.*;

public class ex262_카드2 {
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> queue = new LinkedList<>();
		
		int num = Integer.parseInt(br.readLine());	
		
		for(int i = 1; i <= num; i++)
			queue.offer(i);
		
		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
