package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex307_﻿ZOAC4{
    
  public static void main(String[] args) throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] space = br.readLine().split(" ");
        
    // w개씩 h행에 걸쳐 있을 때 모든 참가자는 세로로 N칸 또는 가로로 M칸 이상 비우고 앉아야 함.
    int hight = Integer.parseInt(space[0]);
    int weight = Integer.parseInt(space[1]); 
    int n = Integer.parseInt(space[2]);
    int m = Integer.parseInt(space[3]);
      
    int maxHight = hight % (n + 1) == 0 ? hight / (n + 1) : (hight / (n + 1)) + 1;
    int maxWeight = weight % (m + 1) == 0 ? weight / (m + 1) : (weight / (m + 1)) + 1;
      
    System.out.println(maxHight * maxWeight); // 강의실이 수용할 수 있는 최대 인원 수
  }
}
