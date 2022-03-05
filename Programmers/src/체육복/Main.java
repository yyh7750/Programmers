package 체육복;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		int n = 5;
		int[] lost = {1, 3};
		int[] reserve = {2, 4, 5};
		
		int result = sol.solution(n, lost, reserve);
		
		System.out.println(result);

	}

}
