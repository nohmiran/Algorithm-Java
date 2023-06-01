package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex280_분해합 {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i <= number; i++){
            int num = i;
            int sum = 0;

            while(num != 0){
                sum = sum + num % 10;
                num = num / 10;
            }
            if(i + sum == number){ 
                System.out.println(i);
                break;
            }
            else if(i == number){
                System.out.println("0");
            }
        }
    }
}
