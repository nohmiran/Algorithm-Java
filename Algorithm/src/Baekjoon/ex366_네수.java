package Baekjoon;

import java.io.*;
import java.util.*;

public class ex366_네수 {
    
	public static void main(String[] args) throws Exception{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		System.out.println(Long.parseLong(st.nextToken()+st.nextToken())+Long.parseLong(st.nextToken()+st.nextToken()));
	}
}
