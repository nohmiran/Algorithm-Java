package Baekjoon;

import java.util.Scanner;

public class ex305_집주소 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            
            String num = sc.next();
            
            if (num.equals("0")){ // 0이라면 멈촤~
                break;
            }
            int count = 2 + num.length() - 1;

            for (int i = 0; i < num.length(); i++){
                if (num.charAt(i) == '1'){
                    count += 2;
                } else if (num.charAt(i) == '0'){
                    count += 4;
                } else {
                    count += 3;
                }
            }
            System.out.println(count);
        }
    }
}
