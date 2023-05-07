import java.util.*;

public class ex255_구간합구하기4 {	
    
  public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = sc.nextInt();
		
		int[] arr = new int[num + 1];
		
		arr[0] = 0;

		for(int i = 1; i <= num; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }
		
		for(int i = 0; i < count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(arr[b]-arr[a-1]);
		}
	}
}
