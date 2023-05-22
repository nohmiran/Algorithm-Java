package Baekjoon;

public class ex268_나이순정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		String[] arr = new String[201];
		Set<Integer> ages = new HashSet<>();
        
		int num = sc.nextInt(); // 입력할 회원 수
        
		for (int i = 0; i < num; i++) {
            
			int age = sc.nextInt(); // 나이 입력
			String name = sc.next(); // 이름 입력
            
			if (arr[age] == null) {
				arr[age] = age + " " + name + "\n";
			} else {
				arr[age] += age + " " + name + "\n";
			}
			ages.add(age);
		}
		List<Integer> list = new ArrayList<>(ages);

		Collections.sort(list);

		for (int age : list) {
			System.out.print(arr[age]);
		}
	}
}
