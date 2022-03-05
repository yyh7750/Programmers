package k번째수;

public class MAIN {

	public static void main(String[] args) {
		int[] ary = {1, 5, 2, 6, 3, 7, 4};
		int[][] com = {{2, 5, 3}, {4, 4, 1}, {5, 6, 3}};

		Solution sol = new Solution();

		int[] result = sol.solution(ary, com);
		
		for(int i : result) {
			System.out.println("" + i);
		}
		
	}
}
