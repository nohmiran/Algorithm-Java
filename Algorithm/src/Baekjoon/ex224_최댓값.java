import java.util.Scanner;

public class ex224_최댓값 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num[][] = new int[10][10];
        
		int max = 0; // 최대값
        
		int x = 0;
    int y = 0; // 좌표

		for (int i = 0; i < 9; i++) {
            
			for (int j = 0; j < 9; j++) {
                
				num[i][j] = sc.nextInt();
				
                if (max < num[i][j]) {
					max = num[i][j];
					x = i; 
          y = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((x + 1) + " " + (y + 1));
	}
}
