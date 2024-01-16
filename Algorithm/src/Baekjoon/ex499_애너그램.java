package Baekjoon;

import java.io.*;
import java.util.*;

public class ex499_애너그램 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int test = Integer.parseInt(br.readLine()); // 테스트 개수

        while (test-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            if (str1.equals(str2)) { // 같은 단어인 경우 애너그램
                bw.write(str1 + " & " + str2 + " are anagrams." + "\n");
                continue;
            }
            if (str1.length() != str2.length()) { // 길이가 다른 경우 애너그램이 아님
                bw.write(str1 + " & " + str2 + " are NOT anagrams." + "\n");
                continue;
            }
            
            // 단어를 문자 배열로 변환 후 정렬
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // 정렬된 문자 배열을 비교하여 애너그램 여부 판단
            boolean isAnagram = true;
            
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    bw.write(str1 + " & " + str2 + " are NOT anagrams." + "\n");
                    isAnagram = false;
                    break;
                }
            }
            
            // 애너그램인 경우 출력
            if (isAnagram) {
                bw.write(str1 + " & " + str2 + " are anagrams." + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
