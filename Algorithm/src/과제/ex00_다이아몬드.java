package 과제;

public class ex00_다이아몬드 {

	public static void main(String[] args) {

		int i, j;

		// 상단 삼각형
		for (i = 0; i <= 2; i++) { // 0 ~ 2줄
			for (j = 1; j >= i; j--) {
				System.out.print(" ");
				// i가 0일 때, j = 1, 0이 빈 칸
				// i가 1일 때, j = 1이 빈 칸
				// i가 2일 때, j = 빈 칸 없음
			}
			for (j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 하단 삼각형
		for (i = 2; i > 0; i--) { // 2, 1줄
			for (j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}