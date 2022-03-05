package 키패드누르기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int[] nArr = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		
		String s = sol.solution(nArr, "right");
		System.out.println(s);
	}

}
