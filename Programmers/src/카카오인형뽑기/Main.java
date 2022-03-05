package 카카오인형뽑기;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		int[][] a = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] b = {1,5,3,5,1,2,1,4};
		
		int answer = sol.solution(a, b);
		
		System.out.println(answer);

	}
}
