package Baekjoon;

import java.io.*;
import java.util.*;

public class ex267_회사에있는사람 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        TreeSet<String> list = new TreeSet<>();

        for (int i = 0; i < num; i++){
            String[] string = bufferedReader.readLine().split(" ");

            if (string[1].equals("enter")){ // 출근
                list.add(string[0]);
            } else { // 퇴근
                list.remove(string[0]);
            }
        }

        for(String enter : list.descendingSet()){
            System.out.println(enter);
        }
    }
}
