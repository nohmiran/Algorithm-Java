package 

import java.util.*;

public class ex447_Periods {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        String spot = ".";
        for (int i = 0; i < n; i++) {
            String content = sc.nextLine();
            boolean isPerfect = content.endsWith(spot);
            String result = isPerfect ? content : content + spot;
            System.out.println(result);
        }
    }
}
