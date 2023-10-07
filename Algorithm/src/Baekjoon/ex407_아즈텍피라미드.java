package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex407_아즈텍피라미드 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int block = 1; // 기본 블록 수
        int addBlock = 1; // 추가 블록 수
        
        int height = 1; // 피라미드 높이
        
        while (true) {
            addBlock += 4 * height; // 각 레벨별로 추가되는 블록 수
            block += addBlock; // 총 블록 수
            
            if (block > input) {
                break;
            }
            
            height++; // 피라미드 높이 증가
        }
        
        System.out.println(height);
    }
}
