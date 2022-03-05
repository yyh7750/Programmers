package 모의고사_수포자;

public class Main {

	public static void main(String[] args) {
		int[] answer = { 1, 3, 2, 4, 2 };
		
		Solution sol = new Solution();
		int[] result = sol.solution(answer);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
