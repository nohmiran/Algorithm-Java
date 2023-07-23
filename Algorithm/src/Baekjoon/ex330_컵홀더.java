package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex330_컵홀더{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count = 1;

        for(int i = 0; i < num; i++) {
        	char a = input.charAt(i);
        	
        	if(a=='S') {
            count++;        	
            } else if(a=='L') {
        		i++;
        		count++;
        	}
        }        
        if(count > num) {
            System.out.println(num);
        }else {
            System.out.println(count);
        }
    }
